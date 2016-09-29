package org.test.tvseries.runner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.CommandLineRunner;
import org.test.tvseries.repository.TvSerieRepository;

import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.instanceOf;

@RunWith(MockitoJUnitRunner.class)
public class StartupRunnerTest {

  @Mock
  private TvSerieRepository repository;

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
}
