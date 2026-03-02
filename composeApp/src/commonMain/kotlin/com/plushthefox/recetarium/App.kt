package com.plushthefox.recetarium

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.plushthefox.recetarium.navigation.RecetariumNavHost
import com.plushthefox.recetarium.theme.AppTheme

@Composable
@Preview
fun App() {

    AppTheme {
        val navController = rememberNavController()
        var showContent by remember { mutableStateOf(false) }
        RecetariumNavHost(navController, Modifier)
    }
}