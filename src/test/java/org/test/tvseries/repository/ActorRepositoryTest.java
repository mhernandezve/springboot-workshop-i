package org.test.tvseries.repository;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.test.tvseries.entity.Actor;

public class ActorRepositoryTest {

  @Test
  public void shouldExtendFromPagingAndSortingRepositoryInterface() {
    Assert.assertThat(createAnInstance(), Matchers.is(Matchers.instanceOf(PagingAndSortingRepository.class)));
  }

  private ActorRepository createAnInstance() {
    return new ActorRepository() {

      @Override
      public Iterable<Actor> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Page<Actor> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public <S extends Actor> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public <S extends Actor> Iterable<S> save(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Actor findOne(Long id) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public boolean exists(Long id) {
        // TODO Auto-generated method stub
        return false;
      }

      @Override
      public Iterable<Actor> findAll() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public Iterable<Actor> findAll(Iterable<Long> ids) {
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
      public void delete(Actor entity) {
        // TODO Auto-generated method stub

      }

      @Override
      public void delete(Iterable<? extends Actor> entities) {
        // TODO Auto-generated method stub

      }

      @Override
      public void deleteAll() {
        // TODO Auto-generated method stub

      }
    };
  }
}
