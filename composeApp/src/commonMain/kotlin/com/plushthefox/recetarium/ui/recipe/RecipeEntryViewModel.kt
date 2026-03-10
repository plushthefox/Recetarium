package com.plushthefox.recetarium.ui.recipe

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.plushthefox.recetarium.data.entities.Recipe
import com.plushthefox.recetarium.data.repositories.RecipesRepository

class RecipeEntryViewModel(recipesRepository: RecipesRepository, ) : ViewModel() {
    var uiState by mutableStateOf(RecipeEntryUiState())
        private set

    fun updateUiState(recipeData: RecipeData) {
        uiState = uiState.copy(recipeData = recipeData, isDataValid = validateData(recipeData))
    }

    private fun validateData(recipeData: RecipeData): Boolean {
        return with(recipeData) {
            name.isNotBlank() && description.isNotBlank()
        }
    }

    suspend fun saveRecipe() {

    }

}

data class RecipeEntryUiState(
    val recipeData: RecipeData = RecipeData("", "", 0),
    val isDataValid: Boolean = false
)

data class RecipeData(
    val name: String,
    val description: String,
    val estimatedTime: Long = 0
) {
    fun toRecipe(): Recipe {
        return Recipe(name = name, description = description, estimatedTime = estimatedTime)
    }
}