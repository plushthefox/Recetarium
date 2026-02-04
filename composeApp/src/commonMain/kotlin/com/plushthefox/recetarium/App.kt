package com.plushthefox.recetarium

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plushthefox.recetarium.theme.AppTheme
import com.plushthefox.recetarium.view.RecetariumToolbar
import org.jetbrains.compose.resources.painterResource

import recetarium.composeapp.generated.resources.Res
import recetarium.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    AppTheme {
        var showContent by remember { mutableStateOf(false) }
        Scaffold(
            topBar = { RecetariumToolbar() },
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.primaryContainer),
            contentWindowInsets = WindowInsets.safeDrawing,
        ) { innerPadding ->
            Column(
                Modifier.padding(
                    top = innerPadding.calculateTopPadding(),
                    start = 8.dp,
                    end = 8.dp
                )
            ) { Text("this is a text") }

        }
    }
}