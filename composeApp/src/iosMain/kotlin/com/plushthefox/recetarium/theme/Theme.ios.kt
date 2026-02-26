package com.plushthefox.recetarium.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.InternalComposeUiApi
import androidx.compose.ui.LocalSystemTheme
import androidx.compose.ui.SystemTheme

@OptIn(InternalComposeUiApi::class)
@Composable
actual fun useDarkTheme(): Boolean {
    return LocalSystemTheme.current == SystemTheme.Dark
}