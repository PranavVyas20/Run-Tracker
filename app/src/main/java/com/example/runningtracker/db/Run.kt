package com.example.runningtracker.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var img:Bitmap? = null,
    // When was the run (time of the run)!
    var timestamp:Long = 0L,
    var avgSpeedInKMH:Float = 0f,
    // how long was the run
    var timeInMillis:Long = 0L,
    var distanceInMeters:Int = 0,
    var caloriesBurnt:Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null
}