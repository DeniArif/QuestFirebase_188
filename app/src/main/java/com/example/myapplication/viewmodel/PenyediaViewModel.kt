package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.myapplication.MahasiswaApplications

object PenyediaViewModel {
    // Factory untuk inisialisasi ViewModel yang diperlukan
    val Factory = viewModelFactory {

        initializer {
            HomeViewModel(aplikasiMahasiswa().container.mahasiswaRepository)
        }
    }

    // Extension function untuk akses instance `MahasiswaApplications` lewat `CreationExtras`
    fun CreationExtras.aplikasiMahasiswa(): MahasiswaApplications =
        (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)
    // Ambil aplikasi utama (cast dari Application) sebagai MahasiswaApplications
}