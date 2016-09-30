package org.test.tvseries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.test.tvseries.entity.TvSerie;
import org.test.tvseries.repository.TvSeriesRepository;

public class TvSeriesController {

  @Autowired
  private TvSeriesRepository repository;

  public Iterable<TvSerie> getAllTvSeries() {
    return repository.findAll();
  }

  public TvSerie getByName(String name) {
    return repository.findByName(name);
  }
}
