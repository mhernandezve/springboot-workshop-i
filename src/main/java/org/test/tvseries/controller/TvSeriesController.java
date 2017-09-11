package org.test.tvseries.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.test.tvseries.entity.TvSerie;
import org.test.tvseries.repository.TvSeriesRepository;

@RestController
@RequestMapping("/test/tvseries")
public class TvSeriesController {

  @Autowired
  private TvSeriesRepository repository;

  @RequestMapping(value="", method=RequestMethod.GET)
  public Iterable<TvSerie> getAllTvSeries() {
    return repository.findAll();
  }

  @RequestMapping(value="/name/{name}", method=RequestMethod.GET)
  public TvSerie getByName(@PathVariable String name) {
    return repository.findByName(name);
  }
}

