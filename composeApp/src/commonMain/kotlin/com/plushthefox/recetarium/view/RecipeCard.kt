package com.plushthefox.recetarium.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.plushthefox.recetarium.model.Recipe

@Composable
fun RecipeCard(modifier: Modifier = Modifier, recipe: Recipe) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface
        )
    ) {
        Column(modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)) {
            Text(text = recipe.name, style = MaterialTheme.typography.headlineMedium, color = MaterialTheme.colorScheme.primary)
            HorizontalDivider(modifier = Modifier.height(2.dp).background(MaterialTheme.colorScheme.onSurface))
            Text(text = recipe.description, style = MaterialTheme.typography.bodyMedium)

        }
    }
}