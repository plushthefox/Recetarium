package com.plushthefox.recetarium.ui.components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import recetarium.composeapp.generated.resources.Res
import recetarium.composeapp.generated.resources.menu_48px

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeListTopAppBar(title: String, icon: Unit, modifier: Modifier = Modifier) {
    TopAppBar(
        title = { Text("Recetarium") },
        modifier = modifier,
        navigationIcon = { Icon(painter = painterResource(Res.drawable.menu_48px), contentDescription = "test") }
    )
}