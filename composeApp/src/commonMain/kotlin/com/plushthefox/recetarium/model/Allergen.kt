package com.plushthefox.recetarium.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author PlushTheFox
 *
 * @property allergenId Primary key
 * @property description A description of the allergen
 */
@Entity
data class Allergen(
    @PrimaryKey(autoGenerate = true) val allergenId: Long = 0,
    val description: String = ""
)
