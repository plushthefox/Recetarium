package com.plushthefox.recetarium.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity for the steps of the recipes
 *
 * @author PlushTheFox
 *
 * @property stepId Primary key
 * @property recipeId Recipe it belongs to
 * @property number Numeric position of the step within the recipe
 * @property description The steps to take
 * @property estimatedTime How long it is estimated to take in seconds
 */
@Entity
data class Step(
    @PrimaryKey(autoGenerate = true) val stepId: Long = 0,
    val recipeId: Long = 0,
    val number: Int = 0,
    val description: String = "",
    val estimatedTime: Long = 0

)
