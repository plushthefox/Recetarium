package com.plushthefox.recetarium.ui.recipe

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.plushthefox.recetarium.ui.AppViewModelProvider
import org.jetbrains.compose.resources.painterResource
import recetarium.composeapp.generated.resources.Res
import recetarium.composeapp.generated.resources.menu_24px


@Composable
fun RecipeListView(
    viewModel: RecipeListViewModel = viewModel(factory = AppViewModelProvider.Factory),
    onRecipeClick: (Int) -> Unit,
    onAddRecipeClick: () -> Unit,
    onSearchRecipeClick: () -> Unit
) {
    Scaffold(
        topBar = {
            RecipeListTopBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding)
        ) {

        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeListTopBar() {
    CenterAlignedTopAppBar(
        title = { Text("Recetarium") },
        modifier = Modifier,
        navigationIcon = {
            Icon(
                painter = painterResource(Res.drawable.menu_24px),
                contentDescription = "Open navigation drawer",
                modifier = Modifier.padding(12.dp)
            )
        }
    )
}