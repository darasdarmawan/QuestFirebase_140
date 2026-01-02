package com.example.firebase.repositori

import com.example.firebase.modeldata.Siswa

interface RepositorySiswa{
    suspend fun getDataSiswa(): List<Siswa>
    suspend fun postDataSiswa(siswa: Siswa)
}