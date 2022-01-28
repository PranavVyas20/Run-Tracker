package com.example.runningtracker.Repositories

import com.example.runningtracker.db.Run
import com.example.runningtracker.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao:RunDao
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurnt() = runDao.getAllRunsSortedByCaloriesBurnt()

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalCaloriesBurnt() = runDao.getTotalCaloriesBurnt()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalTimeInMilis() = runDao.getTotalTimeInMilis()
}