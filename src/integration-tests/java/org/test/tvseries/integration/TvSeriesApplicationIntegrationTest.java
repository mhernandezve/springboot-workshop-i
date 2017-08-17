package org.test.tvseries.integration;

import java.util.List;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class TvSeriesApplicationIntegrationTest {

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void shouldReturnOneGivenGetAllTvSeriesRequest(){
    ResponseEntity<List> response = restTemplate.getForEntity("/test/tvseries", List.class);
    Assert.assertThat(response.getBody().size(), Matchers.is(1));
  }

  @Test
  public void shouldReturnAnEmptyListGivenGetAllActorsRequest(){
    ResponseEntity<String> response = restTemplate.getForEntity("/characters", String.class);
    Assert.assertThat(response.getStatusCode(), Matchers.is(HttpStatus.OK));
  }
}
