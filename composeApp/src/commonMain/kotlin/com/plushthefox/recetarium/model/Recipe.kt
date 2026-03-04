package com.plushthefox.recetarium.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author PlushTheFox
 *
 * @property recipeId Primary key
 * @property name The name of the recipe
 * @property description A brief description of the recipe
 * @property estimatedTime How long it is estimated to take in seconds
 */
@Entity(tableName = "recipes")
data class Recipe(
    @PrimaryKey(autoGenerate = true)
    val recipeId: Long = 0,
    val name: String = "",
    val description: String = "",
    val estimatedTime: Long = 0
)