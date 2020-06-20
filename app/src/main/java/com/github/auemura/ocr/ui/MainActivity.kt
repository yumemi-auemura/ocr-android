package com.github.auemura.ocr.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.github.auemura.ocr.R
import com.github.auemura.ocr.navigation.KeepStateNavigator
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.main_bottom_navigation_view

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.findFragmentById(R.id.main_nav_host_fragment)?.let {
            val navigator = KeepStateNavigator(this, it.childFragmentManager, R.id.main_nav_host_fragment)
            it.findNavController().apply {
                navigatorProvider.addNavigator(navigator)
                setGraph(R.navigation.nav_main)
                main_bottom_navigation_view.setupWithNavController(this)
            }
        }
    }
}
