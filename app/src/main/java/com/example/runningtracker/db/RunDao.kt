package com.example.runningtracker.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run:Run)

    @Delete()
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM running_table ORDER BY timestamp DESC")
     fun getAllRunsSortedByDate() :LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY timeInMillis DESC")
    fun getAllRunsSortedByTimeInMillis() :LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY caloriesBurnt DESC")
    fun getAllRunsSortedByCaloriesBurnt() :LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC")
    fun getAllRunsSortedByAvgSpeed() :LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY distanceInMeters DESC")
    fun getAllRunsSortedByDistance() :LiveData<List<Run>>


    // More functions !! lol lmao xdddddd
    @Query("SELECT SUM(timeInMillis) from running_table")
    fun getTotalTimeInMilis():LiveData<Long>

    @Query("SELECT SUM(caloriesBurnt) from running_table")
    fun getTotalCaloriesBurnt():LiveData<Int>

    @Query("SELECT SUM(distanceInMeters) from running_table")
    fun getTotalDistance():LiveData<Int>

    @Query("SELECT AVG(avgSpeedInKMH) from running_table")
    fun getTotalAvgSpeed():LiveData<Float>
}