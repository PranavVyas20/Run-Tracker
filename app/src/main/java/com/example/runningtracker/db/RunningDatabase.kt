package com.example.runningtracker.db

import androidx.room.*
import androidx.room.TypeConverter

@Database(
    entities = [Run::class],
    version = 1
)
@TypeConverters(RunTypeConverter::class)
abstract class RunningDatabase:RoomDatabase (){

    abstract fun getRunDao():RunDao
    // No need to create the singleton instance of the DB
    // Will do that with dagger LOL LMAO XDDDDD
}