package com.example.myapplication.model

data class Mahasiswa(
    val nim : String,
    val nama : String,
    val alamat : String,
    val jeniskelamin : String,
    val kelas : String,
    val angkatan : String,
    val judulskripsi : String,
    val dosenpem1 : String,
    val dosenpem2: String
)
{
    constructor(

    ):this("","","","","","","", "", "")
}
