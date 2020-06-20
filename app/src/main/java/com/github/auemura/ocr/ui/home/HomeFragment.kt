package com.github.auemura.ocr.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.github.auemura.ocr.R
import com.github.auemura.ocr.databinding.FragmentHomeBinding
import com.github.auemura.ocr.ext.viewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val viewModel: HomeViewModel by viewModels()
    private val binding: FragmentHomeBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = HomeEpoxyController()
        binding.homeEpoxyRecyclerView.setController(controller)
        controller.setData(viewModel.getBooks())
    }
}
