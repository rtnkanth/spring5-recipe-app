package rtnk.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import rtnk.springframework.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
