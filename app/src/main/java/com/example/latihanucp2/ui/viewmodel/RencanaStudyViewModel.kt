package com.example.latihanucp2.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.latihanucp2.model.RencanaStudi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class RencanaStudyViewModel : ViewModel() {
    // Menyimpan state rencana studi yang dapat berubah (mata kuliah dan kelas)
    private val _krsState = MutableStateFlow(RencanaStudi())
    // Menyediakan versi hanya-baca dari _krsState untuk diobservasi oleh UI
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    // Fungsi untuk mengatur mata kuliah pada rencana studi
    fun setMatakuliah(mkPilihan: String) {
        // Memperbarui state rencana studi dengan mata kuliah yang baru
        _krsState.update {  stateMK -> stateMK.copy(mataKuliah = mkPilihan) }
    }
    // Fungsi untuk mengatur kelas pada rencana studi
    fun setKelas(kelasPilihan: String) {
        _krsState.update {  stateMK -> stateMK.copy(kelas = kelasPilihan) }
    }

    //Fungsi untuk menyimpan data mata kuliah dan kelas dari list ke dalam rencana studi
    fun saveDataKRS(ls: MutableList<String>){
        _krsState.update { status -> status.copy(
            mataKuliah = ls[0],
            kelas = ls[1]
        )
        }
    }
}