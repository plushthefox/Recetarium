package com.plushthefox.recetarium.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

fun getDatabaseBuilder(context: Context): RoomDatabase.Builder<RecetariumDatabase> {
    val appContext = context.applicationContext
    val dbFile = appContext.getDatabasePath("recetarium.db")
    return Room.databaseBuilder<RecetariumDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}

actual fun databaseBuilder(): RoomDatabase.Builder<RecetariumDatabase> = getDatabaseBuilder()