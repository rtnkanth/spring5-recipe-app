package rtnk.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import rtnk.springframework.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
