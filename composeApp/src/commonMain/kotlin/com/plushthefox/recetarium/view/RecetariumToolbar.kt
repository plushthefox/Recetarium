package com.plushthefox.recetarium.view

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import org.jetbrains.compose.resources.stringResource
import recetarium.composeapp.generated.resources.Res
import recetarium.composeapp.generated.resources.app_name

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecetariumToolbar(modifier: Modifier = Modifier.fillMaxWidth()) {
    TopAppBar(
        title = {
            Text(stringResource(Res.string.app_name), maxLines = 1, overflow = TextOverflow.Ellipsis, style = MaterialTheme.typography.headlineLarge)
        },
        modifier = modifier,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ),

    )
}