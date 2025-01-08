package com.example.myapplication.repository

import android.app.DownloadManager.Query
import com.example.myapplication.model.Mahasiswa
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.Flow

class NetworkMahasiswaRepository (
    private val firestore: FirebaseFirestore

): MahasiswaRepository{
    override suspend fun getAllMahasiswa(): Flow<List<Mahasiswa>> {
        val mhsCollection = firestore.collection("mahasiswa")
            .orderby("nim", Query.Direction.DECENDING)
            .addSnapshotListener{ value, error ->

                if (value != null){
                    val mhsList = value.documents.{
                        it.toObject(Mahasiswa::class.java)!!
                    }
                    trySend(mhsList)
                }
            }
        awaitClose() {
            mhsCollection.remove()
        }
    }

    override suspend fun insertMahasiswa(mahasiswa: Mahasiswa) {
        TODO("Not yet implemented")
    }

    override suspend fun updateMahasiswa(nim: String) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteMahasiswa() {
        TODO("Not yet implemented")
    }

}
