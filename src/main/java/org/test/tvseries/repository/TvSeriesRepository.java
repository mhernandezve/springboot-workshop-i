package org.test.tvseries.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.tvseries.entity.TvSerie;

@Repository
public interface TvSeriesRepository extends CrudRepository<TvSerie, Long>{

	TvSerie findByName(String name);

}
