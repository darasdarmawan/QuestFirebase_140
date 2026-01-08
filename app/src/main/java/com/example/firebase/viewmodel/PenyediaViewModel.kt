package com.example.firebase.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.firebase.repositori.AplikasiDatasSiswa

fun CreationExtras.aplikasiDataSiswa() : AplikasiDatasSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDatasSiswa
        )
object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiDataSiswa().container.repositorySiswa) }
        initializer { EntryViewModel(aplikasiDataSiswa().container.repositorySiswa) }
        initializer { DetailViewModel(this.createSavedStateHandle(),aplikasiDataSiswa
            ().container.repositorySiswa) }
        initializer { EditViewModel(this.createSavedStateHandle(),aplikasiDataSiswa
            ().container.repositorySiswa) }
    }
}