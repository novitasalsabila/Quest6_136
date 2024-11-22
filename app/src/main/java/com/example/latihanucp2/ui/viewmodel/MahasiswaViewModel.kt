package com.example.latihanucp2.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.latihanucp2.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel :ViewModel() {
    //Request
    private val _statusUI = MutableStateFlow(Mahasiswa())

    //Response
    val statusUI: StateFlow<Mahasiswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: MutableList<String>){
        _statusUI.update { statusSaatIni -> //isi sebuah model: datasiswa
            statusSaatIni.copy(
                nim = ls[0],
                nama = ls[1],
                email = ls[2],

            )
        }
    }
}