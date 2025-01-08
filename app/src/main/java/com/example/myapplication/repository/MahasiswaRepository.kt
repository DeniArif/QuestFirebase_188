package com.example.myapplication.repository

import com.example.myapplication.model.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface MahasiswaRepository {
    suspend fun getAllMahasiswa(): Flow<List<Mahasiswa>>
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    suspend fun updateMahasiswa(nim: String)
    suspend fun deleteMahasiswa()
}