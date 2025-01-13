package com.example.myapplication.ui.viewmodel

import com.example.myapplication.model.Mahasiswa


sealed class FormState {
    object Idle : FormState()
    object Loading : FormState()
    data class Success(val message: String) : FormState()
    data class Error(val message: String) : FormState()
}// data class Insert Ui State
data class InsertUiState(
    val insertUiEvent: MahasiswaEvent = MahasiswaEvent(),
    val isEntryValid: FormErrorState = FormErrorState(),
)
// data class Form Error State
data class FormErrorState(
    val nim: String? = null,
    val nama: String? = null,
    val jenisKelamin: String? = null,
    val alamat: String? = null,
    val kelas: String? = null,
    val angkatan: String? = null
) {
    fun isValid(): Boolean {
        return nim == null && nama == null && jenisKelamin == null &&
                alamat == null && kelas == null && angkatan == null
    }
}
//data class variabel yang menyimpan data input form
data class MahasiswaEvent(
    val nim: String? = "",
    val nama: String? = "",
    val alamat: String? = "",
    val jenisKelamin: String? = "",
    val kelas: String? = "",
    val angkatan: String? = ""
)
// Menyimpan input form kedalam entity
fun MahasiswaEvent.toMhsModel() : Mahasiswa = Mahasiswa(
    nim = nim,
    nama = nama,
    alamat = alamat,
    jenisKelamin = jenisKelamin,
    kelas = kelas,
    angkatan = angkatan
)