package org.test.tvseries.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.tvseries.entity.Actor;

@RepositoryRestResource
public interface ActorRepository extends PagingAndSortingRepository<Actor, Long>{
}
