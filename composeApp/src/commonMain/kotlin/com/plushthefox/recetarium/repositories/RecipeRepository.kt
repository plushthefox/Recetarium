package com.plushthefox.recetarium.repositories

import com.plushthefox.recetarium.database.RecipeDao
import com.plushthefox.recetarium.model.Recipe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flowOn

class RecipeRepository(private val recipeDao: RecipeDao) {
    val allRecipes: Flow<List<Recipe>> = recipeDao.getAllRecipes().flowOn(Dispatchers.IO)
}