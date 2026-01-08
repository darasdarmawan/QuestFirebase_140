package com.example.firebase.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.firebase.modeldata.Siswa
import com.example.firebase.repositori.RepositorySiswa
import com.example.firebase.view.route.DestinasiDetail

sealed interface StatusUIDetail {
    data class Success(val satuSiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}
class DetailViewModel(savedStateHandle: SavedStateHandle,private val  repositorySiswa: RepositorySiswa):
    ViewModel() {
        private val idSiswa: Long =
            savedStateHandle.get<String>(DestinasiDetail.itemIdArg)?.toLong()
                ?: error("idSIswa tidak ditemukan di SavedStateHandle")
    var statusUIDetail: StatusUIDetail by mutableStateOf(StatusUIDetail.Loading)
        private set
    init {
        getSatuSiswa()
    }
    }