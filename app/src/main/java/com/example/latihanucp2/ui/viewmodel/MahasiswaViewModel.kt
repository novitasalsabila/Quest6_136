package com.example.latihanucp2.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.latihanucp2.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel :ViewModel() {
    // Request: Variabel untuk menyimpan status data mahasiswa yang dapat berubah
    private val _statusUI = MutableStateFlow(Mahasiswa())

    // Response: Mengubah _statusUI menjadi StateFlow yang hanya bisa dibaca (immutable)
    val statusUI: StateFlow<Mahasiswa> = _statusUI.asStateFlow()
    // Fungsi untuk menyimpan data mahasiswa ke dalam _statusUI
    fun saveDataSiswa(ls: MutableList<String>){
        // Update nilai _statusUI dengan data yang baru
        _statusUI.update { statusSaatIni -> //isi sebuah model: datasiswa
            statusSaatIni.copy(
                nim = ls[0], // Menyimpan NIM dari list
                nama = ls[1],
                email = ls[2],

            )
        }
    }
}