package com.plushthefox.recetarium.ui

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.plushthefox.recetarium.data.OfflineRecipesRepository
import com.plushthefox.recetarium.data.RecipesRepository
import com.plushthefox.recetarium.ui.recipe.RecipeListViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            RecipeListViewModel(repository = getRecipeRepository())
        }
    }
}

fun getRecipeRepository(): RecipesRepository = OfflineRecipesRepository()