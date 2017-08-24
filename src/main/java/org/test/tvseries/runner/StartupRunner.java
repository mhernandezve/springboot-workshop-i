package org.test.tvseries.runner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.test.tvseries.entity.Actor;
import org.test.tvseries.entity.TvSerie;
import org.test.tvseries.repository.TvSeriesRepository;

public class StartupRunner implements CommandLineRunner {

  private final Log logger = LogFactory.getLog(getClass());

  @Autowired
  private TvSeriesRepository repository;

  @Override
  public void run(String... args) throws Exception {
    saveSampleData();
    logger.info("Number of tvseries: " + repository.count());
  }

  public void saveSampleData() {
    TvSerie tvSerie = new TvSerie("Daredevil");
    Actor actor = new Actor("Matt Murdoc");
    tvSerie.getActors().add(actor);
    repository.save(tvSerie);
  }

}
