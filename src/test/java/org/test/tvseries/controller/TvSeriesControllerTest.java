package org.test.tvseries.controller;

import static java.util.Arrays.asList;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.test.tvseries.entity.TvSerie;
import org.test.tvseries.repository.TvSeriesRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(TvSeriesController.class)
public class TvSeriesControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private TvSeriesRepository repository;

  @Test
  public void shouldReturnTvSeriesGivenGetAllTvSeriesRequest() throws Exception {
    String name = "someSerie";
    Iterable<TvSerie> tvSeries = asList(new TvSerie(name));
    given(repository.findAll()).willReturn(tvSeries);
    mockMvc.perform(get("/test/tvseries").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
      .andExpect(jsonPath("$..name").value(name));
  }

  @Test
  public void shouldReturnAtvSerieGivenGetByNameRequest() throws Exception {
    String name = "someSerie";
    TvSerie tvSerie = new TvSerie(name);
    given(repository.findByName(name)).willReturn(tvSerie);
    mockMvc.perform(get("/test/tvseries/name/" + name).accept(MediaType.APPLICATION_JSON))
      .andExpect(status().isOk())
      .andExpect(jsonPath("$..name").value(name));
  }
}
