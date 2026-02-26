package com.plushthefox.recetarium.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plushthefox.recetarium.model.Ingredient
import com.plushthefox.recetarium.model.Recipe
import com.plushthefox.recetarium.model.RecipeIngredient
import com.plushthefox.recetarium.model.Step

@Database(entities = [Recipe::class, Ingredient::class, RecipeIngredient::class, Step::class], version = 1)
abstract class RecetariumDatabase: RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
}