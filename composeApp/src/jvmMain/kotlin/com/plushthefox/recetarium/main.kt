package com.plushthefox.recetarium

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.plushthefox.recetarium.data.getDatabaseBuilder

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "recetarium",
    ) {
        App(getDatabaseBuilder().build())
    }
}