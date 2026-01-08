package com.example.firebase.viewmodel

import com.example.firebase.modeldata.Siswa

sealed interface StatusUIDetail {
    data class Success(val satuSiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}