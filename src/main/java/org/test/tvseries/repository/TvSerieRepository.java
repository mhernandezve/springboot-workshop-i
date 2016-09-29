package org.test.tvseries.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.tvseries.entity.TvSerie;

@Repository
public interface TvSerieRepository extends CrudRepository<TvSerie, Long>{

}
