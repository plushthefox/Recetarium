package com.plushthefox.recetarium.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.RoomDatabaseConstructor
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.plushthefox.recetarium.data.dao.RecipeDao
import com.plushthefox.recetarium.model.Ingredient
import com.plushthefox.recetarium.model.Recipe
import com.plushthefox.recetarium.model.RecipeIngredient
import com.plushthefox.recetarium.model.Step
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO

@Database(entities = [Recipe::class, Ingredient::class, RecipeIngredient::class, Step::class], version = 1)
@ConstructedBy(RecetariumDatabaseConstructor::class)
abstract class RecetariumDatabase: RoomDatabase() {
    abstract fun recipeDao(): RecipeDao


}

@Suppress("KotlinNoActualForExpect")
expect object RecetariumDatabaseConstructor : RoomDatabaseConstructor<RecetariumDatabase> {
    override fun initialize(): RecetariumDatabase
}

// TODO: Per platform database implementation
fun getRoomDatabase(
    builder: RoomDatabase.Builder<RecetariumDatabase>
): RecetariumDatabase {
    return builder
        .setDriver(BundledSQLiteDriver())
        .setQueryCoroutineContext(Dispatchers.IO)
        .build()
}
