package com.example.runningtracker.ui.ViewModel

import androidx.lifecycle.ViewModel
import com.example.runningtracker.Repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel  @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}