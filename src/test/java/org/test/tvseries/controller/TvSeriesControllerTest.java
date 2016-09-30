package org.test.tvseries.controller;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.test.tvseries.entity.TvSerie;
import org.test.tvseries.repository.TvSeriesRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TvSeriesControllerTest {

  @Mock
  private TvSeriesRepository tvSeriesRepository;

  @Autowired
  @InjectMocks
  private TvSeriesController tvSeriesController;

  @Test
  public void shouldReturnAllTvSeries(){
    Iterable<TvSerie> tvSeries = new ArrayList<>();
    when(tvSeriesRepository.findAll()).thenReturn(tvSeries);
    assertEquals(tvSeries, tvSeriesController.getAllTvSeries());
  }

  @Test
  public void shouldReturnTvSerieByName() {
    TvSerie tvSerie = new TvSerie();
    String name = "someName";
    when(tvSeriesRepository.findByName(name)).thenReturn(tvSerie);
    assertEquals(tvSerie, tvSeriesController.getByName(name));
  }
}
