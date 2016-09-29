package org.test.tvseries.repository;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.repository.CrudRepository;
import org.test.tvseries.entity.TvSerie;

public class TvSerieRepositoryTest {

  @Test
  public void shouldExtendFromCrudRepository(){
    Assert.assertThat(constructInstanceOfTvSerieRepository(), Matchers.instanceOf(CrudRepository.class));
  }

  private TvSerieRepository constructInstanceOfTvSerieRepository() {
    return new TvSerieRepository() {

      @Override
      public <S extends TvSerie> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public <S extends TvSerie> Iterable<S> save(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public TvSerie findOne(Long id) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public boolean exists(Long id) {
        // TODO Auto-generated method stub
        return false;
      }

      @Override
      public Iterable<TvSerie> findAll() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Iterable<TvSerie> findAll(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public long count() {
        // TODO Auto-generated method stub
        return 0;
      }

      @Override
      public void delete(Long id) {
        // TODO Auto-generated method stub

      }

      @Override
      public void delete(TvSerie entity) {
        // TODO Auto-generated method stub

      }

      @Override
      public void delete(Iterable<? extends TvSerie> entities) {
        // TODO Auto-generated method stub

      }

      @Override
      public void deleteAll() {
        // TODO Auto-generated method stub

      }
    };
  }

}
