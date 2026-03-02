package com.plushthefox.recetarium.data

import com.plushthefox.recetarium.data.dao.RecipeDao

class OfflineRecipesRepository(private val recipeDao: RecipeDao): RecipesRepository {
}