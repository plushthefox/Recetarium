package com.plushthefox.recetarium.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * This entity indicates the specific product, with brand, amount per unit, price, where to buy it, etc.
 * Example: Flour El Gallo, 200 g
 *
 * @author PlushTheFox
 *
 * @property storeProductId Primary key
 * @property ingredientId The generic ingredient it is
 * @property brand The brand of the product
 * @property amount How much of the product is in each unit expressed in weight or volume.
 * @property price How much each unit costs. If the currency has decimals, multiply it by 100
 * @property priceAmount A standardized measurement of how much the product costs per g, l, oz, lb, etc.
 * @property amountAvailable How much is left in the inventory
 */
@Entity
data class StoreProduct(
    @PrimaryKey(autoGenerate = true) val storeProductId: Long = 0,
    val ingredientId: Long = 0,
    val brand: String = "",
    // Int instead of Double, because what store would sell you 100.25 g or 200.45 lb?
    val amount: Int = 0,
    // Int to prevent floating point precision issues and speed up the math a bit
    // Just imagine the unit is 1 / 100th of the currency, unless the currency doesn't have fractions
    val price: Int = 0,
    // rounded( price / amount ) = priceAmount
    val priceAmount: Int = 0,
    val amountAvailable: Double = 0.0
)
