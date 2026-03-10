package com.plushthefox.recetarium

import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.plushthefox.recetarium.data.repositories.OfflineRecipesRepository
import com.plushthefox.recetarium.data.RecetariumDatabase
import com.plushthefox.recetarium.navigation.RecipeList
import com.plushthefox.recetarium.theme.AppTheme
import com.plushthefox.recetarium.ui.recipe.RecipeListView
import com.plushthefox.recetarium.ui.recipe.RecipeListViewModel


@Composable
fun App(
    database: RecetariumDatabase
) {

    AppTheme {

        val navController = rememberNavController()
        var showContent by remember { mutableStateOf(false) }

        NavHost(navController = navController, startDestination = RecipeList.route) {
            composable(route = RecipeList.route) {
                val recipeListViewModel = RecipeListViewModel(OfflineRecipesRepository(database.recipeDao()))
                RecipeListView(
                    viewModel = recipeListViewModel,
                    onRecipeClick = { },
                    onAddRecipeClick = { },
                    onSearchRecipeClick = { }
                )
            }
        }
    }


}