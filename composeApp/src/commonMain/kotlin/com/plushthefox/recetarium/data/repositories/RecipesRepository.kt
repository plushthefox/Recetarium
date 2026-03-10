package com.plushthefox.recetarium.data.repositories

import com.plushthefox.recetarium.data.entities.Recipe
import com.plushthefox.recetarium.data.entities.Step
import kotlinx.coroutines.flow.Flow

interface RecipesRepository {

    fun getAllRecipesStream(): Flow<List<Recipe>>

    suspend fun insertRecipe(recipe: Recipe)

    suspend fun deleteRecipe(recipe: Recipe)

    fun getStepsStream(recipe: Recipe): Flow<List<Step>>

}