package com.plushthefox.recetarium.database

import androidx.room.Dao
import androidx.room.Query
import com.plushthefox.recetarium.model.Recipe
import kotlinx.coroutines.flow.Flow


@Dao
interface RecipeDao {
    @Query("SELECT * FROM recipe ORDER BY name ASC")
    fun getAllRecipes(): Flow<List<Recipe>>


}