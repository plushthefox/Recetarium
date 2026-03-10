package com.plushthefox.recetarium.data

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.plushthefox.recetarium.data.RecetariumDatabase


fun getDatabaseBuilder(context: Context): RoomDatabase.Builder<RecetariumDatabase> {
    val appContext = context.applicationContext
    val dbFile = appContext.getDatabasePath("recetarium.db")
    return Room.databaseBuilder<RecetariumDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}
