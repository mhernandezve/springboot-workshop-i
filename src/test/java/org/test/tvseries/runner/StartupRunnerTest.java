package org.test.tvseries.runner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.CommandLineRunner;
import org.test.tvseries.entity.Actor;
import org.test.tvseries.entity.TvSerie;
import org.test.tvseries.repository.TvSeriesRepository;

import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.instanceOf;

@RunWith(MockitoJUnitRunner.class)
public class StartupRunnerTest {

  @Mock
  private TvSeriesRepository repository;

  @InjectMocks
  private StartupRunner startupRunner = new StartupRunner();

  @Test
  public void shouldImplementsCommandLineRunner() {
    assertThat(startupRunner, instanceOf(CommandLineRunner.class));
  }

  @Test
  public void shouldLogNumberOfRecordsOfTvSeries() throws Exception {
    Long numberOfRecords = 1L;
    Mockito.when(repository.count()).thenReturn(numberOfRecords);
    String args = "someArgs";
    startupRunner.run(args);
    Mockito.verify(repository).count();
  }

  @Test
  public void shouldInsertAtvSerieData() {
    TvSerie tvSerie = new TvSerie("Daredevil");
    Actor actor = new Actor("Matt Murdoc");
    tvSerie.getActors().add(actor);
    Mockito.when(repository.save(tvSerie)).thenReturn(tvSerie);
    startupRunner.saveSampleData();
    Mockito.verify(repository).save(Mockito.any(TvSerie.class));
  }

  @Test
  public void shouldCallInsertDataAtRunMethod() throws Exception {
    StartupRunner runner = Mockito.spy(startupRunner);
    String args = "someArgs";
    runner.run(args);
    Mockito.verify(runner).saveSampleData();
  }
}
