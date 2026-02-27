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
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.plushthefox.recetarium.model.Recipe
import com.plushthefox.recetarium.navigation.RecetariumNavHost
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
        val navController = rememberNavController()
        var showContent by remember { mutableStateOf(false) }
        RecetariumNavHost(navController, Modifier)
    }
}