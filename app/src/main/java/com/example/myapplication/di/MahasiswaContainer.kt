package com.example.myapplication.di


import com.example.myapplication.repository.MahasiswaRepository

interface AppContainer{
    val mahasiswaRepository: MahasiswaRepository
}

class MahasiswaContainer: AppContainer{
    private val firbase: FirebaseFirestore = FirstbaseFirestore


}