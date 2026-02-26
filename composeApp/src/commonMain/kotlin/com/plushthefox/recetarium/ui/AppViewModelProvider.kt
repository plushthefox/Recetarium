package com.plushthefox.recetarium.ui

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.plushthefox.recetarium.ui.recipe.RecipeListViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            RecipeListViewModel()
        }
    }
}