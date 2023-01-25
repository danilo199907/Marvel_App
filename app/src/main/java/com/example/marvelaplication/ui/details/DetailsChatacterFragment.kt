package com.example.marvelaplication.ui.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.marvelaplication.databinding.FragmentDetailsCharacterBinding
import com.example.marvelaplication.ui.base.BaseFragment

class DetailsChatacterFragment :
    BaseFragment<FragmentDetailsCharacterBinding, DetailsChatacterViewModel>() {

    override val viewModel: DetailsChatacterViewModel by viewModels()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailsCharacterBinding =
        FragmentDetailsCharacterBinding.inflate(inflater, container, false)
}