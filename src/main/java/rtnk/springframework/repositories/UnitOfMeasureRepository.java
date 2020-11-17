package rtnk.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import rtnk.springframework.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
