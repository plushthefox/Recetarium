package com.plushthefox.recetarium.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.plushthefox.recetarium.ui.recipe.RecipeListView

@Composable
fun RecetariumNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = RecipeList.route,
        modifier = modifier
    ) {
        composable(route = RecipeList.route) {
            RecipeListView(
                onRecipeClick = { },
                onAddRecipeClick = { },
                onSearchRecipeClick = { }
            )
        }
    }
}