package com.plushthefox.recetarium.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * This entity acts as a classification system. Here you indicate the generic name of the ingredient, i.e. flour.
 *
 * @author PlushTheFox
 *
 * @property ingredientId Primary Key
 * @property description A brief description of the ingredient. Keep it generic: "All-purpose flour", "Sugar", "Sodium bicarbonate".ç
 */
@Entity
data class Ingredient(
    @PrimaryKey(autoGenerate = true) val ingredientId: Long = 0,
    val description: String = ""
)
