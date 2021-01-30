package rtnk.springframework.services;

import rtnk.springframework.commands.RecipeCommand;
import rtnk.springframework.domain.Recipe;

import java.util.Set;


public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
