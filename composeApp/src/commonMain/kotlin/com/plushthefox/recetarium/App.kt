package com.plushthefox.recetarium

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plushthefox.recetarium.model.Recipe
import com.plushthefox.recetarium.theme.AppTheme
import com.plushthefox.recetarium.view.RecetariumToolbar
import com.plushthefox.recetarium.view.RecipeCard
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import recetarium.composeapp.generated.resources.Res
import recetarium.composeapp.generated.resources.add_48px
import recetarium.composeapp.generated.resources.add_recipe

@Composable
@Preview
fun App() {

    AppTheme {
        var showContent by remember { mutableStateOf(false) }
        Scaffold(
            topBar = { RecetariumToolbar() },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = {},
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                ) {
                    Icon(
                        painter = painterResource(Res.drawable.add_48px),
                        contentDescription = stringResource(Res.string.add_recipe)
                    )
                }
            },
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.primaryContainer),
            contentWindowInsets = WindowInsets.safeDrawing,

            ) { innerPadding ->
            LazyColumn(
                modifier = Modifier.padding(
                    top = innerPadding.calculateTopPadding(),
                    start = 8.dp,
                    end = 8.dp

                )
            ) {
            }

        }
    }
}