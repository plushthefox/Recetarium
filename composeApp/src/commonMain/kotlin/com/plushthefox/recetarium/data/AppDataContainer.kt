package com.plushthefox.recetarium.data

import com.plushthefox.recetarium.database.RecetariumDatabase
import com.plushthefox.recetarium.database.databaseBuilder
import com.plushthefox.recetarium.database.getRoomDatabase

class AppDataContainer() {
    val recipesRepository: RecipesRepository by lazy {
        OfflineRecipesRepository(getRoomDatabase(databaseBuilder()).recipeDao())
    }
}

