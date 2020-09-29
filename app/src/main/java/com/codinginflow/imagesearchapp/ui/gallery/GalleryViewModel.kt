package com.codinginflow.imagesearchapp.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.codinginflow.imagesearchapp.data.UnsplashRespository

class GalleryViewModel @ViewModelInject constructor (
    private val repository: UnsplashRespository
): ViewModel() {

}