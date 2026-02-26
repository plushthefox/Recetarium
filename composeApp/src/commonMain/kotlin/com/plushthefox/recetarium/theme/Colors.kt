package com.plushthefox.recetarium.theme


import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Light theme colors
val BackgroundLight = Color(0xffebe8eb)
val OnBackgroundLight = Color(0xff4c4f69)
val PrimaryContainerLight = Color(0xffe4c632)
val PrimaryLight = Color(0xff4e4100)
val SecondaryLight = Color(0xff32E4C6)
val TertiaryLight = Color(0xffC632E4)
val OnPrimaryLight = Color(0xff0f0f17)
val SurfaceLight = Color(0xffdfdadf)
val OnSurfaceLight = Color(0xff2c2d3c)


// Dark theme colors
    val BackgroundDark = Color(0xff110f11)
val OnBackgroundDark = Color(0xffe4e3dd)
val PrimaryDark = Color(0xffffec90)
val SecondaryDark = Color(0xff90FFEC)
val TertiaryDark = Color(0xffEC90FF)
val SurfaceDark = Color(0xff2a252a)
val OnSurfaceDark = OnBackgroundDark


internal val LightColorScheme = lightColorScheme(
    background = BackgroundLight,
    onBackground = OnBackgroundLight,
    primary = PrimaryLight,
    primaryContainer = PrimaryContainerLight,
    onPrimary = OnPrimaryLight,
    secondary = SecondaryLight,
    tertiary = TertiaryLight,
    surface = SurfaceLight,
    onSurface = OnSurfaceLight,
)

internal val DarkColorScheme = darkColorScheme(
    background = BackgroundDark,
    onBackground = OnBackgroundDark,
    primary = PrimaryDark,
    primaryContainer = PrimaryDark,
    onPrimary = BackgroundDark,
    secondary = SecondaryDark,
    tertiary = TertiaryDark,
    surface = SurfaceDark,
    onSurface = OnSurfaceDark,
)
