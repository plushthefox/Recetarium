package com.plushthefox.recetarium.data

import androidx.room.Room
import androidx.room.RoomDatabase
import com.plushthefox.recetarium.data.RecetariumDatabase
import java.io.File

fun getDatabaseBuilder(): RoomDatabase.Builder<RecetariumDatabase> {
    val dbFile = File(System.getProperty("java.io.tmpdir"), "recetarium.db")
    print("STORING DATABASE IN: " + dbFile.absolutePath)
    return Room.databaseBuilder<RecetariumDatabase>(
        name = dbFile.absolutePath
    )
}
