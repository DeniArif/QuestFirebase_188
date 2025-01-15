package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myapplication.MahasiswaApplication

import com.example.myapplication.ui.viewmodel.InsertViewModel

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiKontak().container.mahasiswaRepository) }
        initializer { InsertViewModel(aplikasiKontak().container.mahasiswaRepository) }
    }
}
fun CreationExtras.aplikasiKontak(): MahasiswaApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as MahasiswaApplication)