package com.plushthefox.recetarium.data.repositories

import com.plushthefox.recetarium.data.dao.RecipeDao
import com.plushthefox.recetarium.data.entities.Recipe
import com.plushthefox.recetarium.data.entities.Step
import kotlinx.coroutines.flow.Flow

class OfflineRecipesRepository(private val recipeDao: RecipeDao): RecipesRepository {
    override fun getAllRecipesStream(): Flow<List<Recipe>> = recipeDao.getAllRecipes()

    override suspend fun insertRecipe(recipe: Recipe) = recipeDao.insert(recipe)

    override suspend fun deleteRecipe(recipe: Recipe) = recipeDao.delete(recipe)
    override fun getStepsStream(recipe: Recipe): Flow<List<Step>> {
        TODO("Not yet implemented")
    }

}