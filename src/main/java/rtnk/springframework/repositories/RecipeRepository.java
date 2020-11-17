package rtnk.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import rtnk.springframework.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
