package com.example.runningtracker.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import com.example.runningtracker.R
import com.example.runningtracker.ui.ViewModel.MainViewModel
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class TrackingFragment : Fragment(R.layout.fragment_tracking) {
    private val m_viewModel: MainViewModel by viewModels()
    // This is not the mapView from the xml!!!, mapView is just the place holder for the actual
    // map object!
    private var map:GoogleMap? = null
    lateinit var mapView: MapView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mapView = view.findViewById<MapView>(R.id.mapView)

        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync {
            map =  it
        }
    }
// will have to handle the lifecycle of the map view khud se !!
    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        mapView.onSaveInstanceState(outState)
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }
}