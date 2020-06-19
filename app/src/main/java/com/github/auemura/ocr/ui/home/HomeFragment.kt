package com.github.auemura.ocr.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.github.auemura.ocr.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val viewModel: HomeViewModel by viewModels()
}
