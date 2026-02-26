package com.plushthefox.recetarium.ui.recipe

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.plushthefox.recetarium.theme.AppTheme
import com.plushthefox.recetarium.ui.AppViewModelProvider



@Composable
fun RecipeListView(
    viewModel: RecipeListViewModel = viewModel(factory = AppViewModelProvider.Factory)
) {
    AppTheme {

    }
}