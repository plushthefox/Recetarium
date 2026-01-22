package com.plushthefox.recetarium

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform