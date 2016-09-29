package org.test.tvseries;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.test.tvseries.runner.StartupRunner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TvSeriesApplicationTest {

  @MockBean
  private StartupRunner startupRunner;
  @Autowired
  private TvSeriesApplication tvseriesApplication;

  @Test
  public void shouldHaveTvSerieRepositoryBean() {
    assertThat(tvseriesApplication.scheduleRunner(), equalTo(startupRunner));
  }

}
