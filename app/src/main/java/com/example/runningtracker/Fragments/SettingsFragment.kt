package com.example.runningtracker.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.runningtracker.R
import com.example.runningtracker.ui.ViewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class SettingsFragment : Fragment(R.layout.fragment_settings) {
    private val m_viewModel: MainViewModel by viewModels()



}