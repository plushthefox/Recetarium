package com.plushthefox.recetarium.data

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.plushthefox.recetarium.data.dao.RecipeDao
import com.plushthefox.recetarium.data.entities.Ingredient
import com.plushthefox.recetarium.data.entities.Recipe
import com.plushthefox.recetarium.data.entities.RecipeIngredient
import com.plushthefox.recetarium.data.entities.Step
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

@Database(entities = [Recipe::class, Ingredient::class, RecipeIngredient::class, Step::class], version = 1)
@ConstructedBy(RecetariumDatabaseConstructor::class)
abstract class RecetariumDatabase: RoomDatabase() {
    abstract fun recipeDao(): RecipeDao


}

@Suppress("KotlinNoActualForExpect", "EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect object RecetariumDatabaseConstructor : RoomDatabaseConstructor<RecetariumDatabase> {
    override fun initialize(): RecetariumDatabase
}

fun getRoomDatabase(
    builder: RoomDatabase.Builder<RecetariumDatabase>
): RecetariumDatabase {
    return builder
        .setDriver(BundledSQLiteDriver())
        .setQueryCoroutineContext(Dispatchers.IO)
        .build()
}

