package com.plushthefox.recetarium.database

import androidx.room.Room
import androidx.room.RoomDatabase
import java.io.File

fun getDatabaseBuilder(): RoomDatabase.Builder<RecetariumDatabase> {
    val dbFile = File(System.getProperty("java.io.tmpdir"), "recetarium.db")
    print("STORING DATABASE IN: " + dbFile.absolutePath)
    return Room.databaseBuilder<RecetariumDatabase>(
        name = dbFile.absolutePath
    )
}
