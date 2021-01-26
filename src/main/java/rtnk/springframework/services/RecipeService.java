package rtnk.springframework.services;

import org.springframework.stereotype.Service;
import rtnk.springframework.domain.Recipe;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
