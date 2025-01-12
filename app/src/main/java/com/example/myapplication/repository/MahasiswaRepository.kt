package com.example.myapplication.repository

import com.example.myapplication.model.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface MahasiswaRepository {
    // Mengambil daftar semua mahasiswa
    suspend fun getAllMahasiswa(): Flow<List<Mahasiswa>>

    // Menambahkan data mahasiswa
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    // Memperbarui data mahasiswa berdasarkan NIM
    suspend fun updateMahasiswa(nim: String, mahasiswa: Mahasiswa)

    // Menghapus mahasiswa berdasarkan NIM
    suspend fun deleteMahasiswa(nim: String)

    // Mengambil data mahasiswa berdasarkan NIM
    suspend fun getMahasiswabyNim(nim: String): Mahasiswa
}