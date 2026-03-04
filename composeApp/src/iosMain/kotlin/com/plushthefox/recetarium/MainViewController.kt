package com.plushthefox.recetarium

import androidx.compose.ui.window.ComposeUIViewController
import com.plushthefox.recetarium.database.getDatabaseBuilder

fun MainViewController() = ComposeUIViewController { App(getDatabaseBuilder()) }