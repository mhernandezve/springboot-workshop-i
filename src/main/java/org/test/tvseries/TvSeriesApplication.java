package org.test.tvseries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.test.tvseries.runner.StartupRunner;

@SpringBootApplication
public class TvSeriesApplication {

  public static void main(String[] args){
    SpringApplication.run(TvSeriesApplication.class, args);
  }

  @Bean
  public StartupRunner scheduleRunner() {
    return new StartupRunner();
  }
}
