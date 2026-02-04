package com.plushthefox.recetarium.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Intermediary entity to join recipes with ingredients
 *
 * @author PlushTheFox
 *
 * @property recipeIngredientId Primary key
 * @property recipeId The id of the recipe it is a part of
 * @property ingredientId The id of the ingredient it represents
 * @property quantity How much of the ingredient is needed
 */
@Entity
data class RecipeIngredient(
    @PrimaryKey(autoGenerate = true) val recipeIngredientId: Long = 0,
    val recipeId: Long = 0,
    val ingredientId: Long = 0,
    val quantity: Double = 0.0,
)
