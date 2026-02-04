package com.plushthefox.recetarium.theme


import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Light theme colors
val BackgroundLight = Color(0xffeff1f5)
val OnBackgroundLight = Color(0xff4c4f69)
val PrimaryContainerLight = Color(0xffe49a32)
val OnPrimaryContainerLight = Color(0xff0f0f17)
val SurfaceLight = Color(0xffccd0da)
val OnSurfaceLight = Color(0xff2c2d3c)


// Dark theme colors
val BackgroundDark = Color(0xff1e1e2e)
val OnBackgroundDark = Color(0xffcdd6f4)
val PrimaryContainerDark = Color(0xfff9e2af)
val SurfaceDark = Color(0xff313244)
val OnSurfaceDark = OnBackgroundDark


internal val LightColorScheme = lightColorScheme(
    background = BackgroundLight,
    onBackground = OnBackgroundLight,
    primaryContainer = PrimaryContainerLight,
    onPrimaryContainer = OnPrimaryContainerLight,
    surface = SurfaceLight,
    onSurface = OnSurfaceLight,
)

internal val DarkColorScheme = darkColorScheme(
    background = BackgroundDark,
    onBackground = OnBackgroundDark,
    primaryContainer = PrimaryContainerDark,
    onPrimaryContainer = BackgroundDark,
    surface = SurfaceDark,
    onSurface = OnSurfaceDark,
)
