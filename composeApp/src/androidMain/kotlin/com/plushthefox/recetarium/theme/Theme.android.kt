package com.plushthefox.recetarium.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable

@Composable
actual fun useDarkTheme(): Boolean {
    return isSystemInDarkTheme()
}