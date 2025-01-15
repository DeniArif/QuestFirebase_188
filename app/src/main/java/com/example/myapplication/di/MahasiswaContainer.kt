package com.example.myapplication.di


import com.example.myapplication.repository.MahasiswaRepository
import com.example.myapplication.repository.NetworkMahasiswaRepository
import com.google.firebase.firestore.FirebaseFirestore

interface AppContainer{
    val repository : MahasiswaRepository
}

class MahasiswaContainer: AppContainer{
    private val firebase: FirebaseFirestore = FirebaseFirestore.getInstance()

    override val repository: MahasiswaRepository by lazy {
        NetworkMahasiswaRepository(firebase)
    }

}