package com.plushthefox.recetarium.ui.recipe

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plushthefox.recetarium.data.repositories.RecipesRepository
import com.plushthefox.recetarium.data.entities.Recipe
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class RecipeListViewModel(recipesRepository: RecipesRepository): ViewModel() {
    companion object {
        private const val TIMEOUT_MILIS = 5_000L
    }

    val recipeListUiState: StateFlow<RecipeListUiState> =
        recipesRepository.getAllRecipesStream().map { RecipeListUiState(it) }
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(TIMEOUT_MILIS),
                initialValue = RecipeListUiState()
            )
}

data class RecipeListUiState(
    val recipes: List<Recipe> = listOf()
)