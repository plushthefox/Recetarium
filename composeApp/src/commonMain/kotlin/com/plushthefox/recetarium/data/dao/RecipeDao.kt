package com.plushthefox.recetarium.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.plushthefox.recetarium.model.Recipe
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipeDao {
    @Query("SELECT * FROM recipes")
    fun getAllRecipes(): Flow<Recipe>
}