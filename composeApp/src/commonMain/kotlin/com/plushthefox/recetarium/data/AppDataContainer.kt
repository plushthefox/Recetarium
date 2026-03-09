package com.plushthefox.recetarium.data

import com.plushthefox.recetarium.database.getRoomDatabase



class AppDataContainer() {
    val recipesRepository: RecipesRepository by lazy {
        OfflineRecipesRepository(getRoomDatabase().recipeDao())
    }
}
