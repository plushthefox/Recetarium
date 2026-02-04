package com.plushthefox.recetarium.model

import androidx.room.Entity

@Entity(primaryKeys = ["productId", "allergenId"])
data class ProductAllergen(
    val productId: Long = 0,
    val allergenId: Long = 0
)
