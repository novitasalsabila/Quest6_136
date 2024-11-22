package com.example.latihanucp2.navigation


import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.latihanucp2.ui.screen.DatailView
import com.example.latihanucp2.ui.screen.MahasiswaFormView
import com.example.latihanucp2.ui.screen.RencanaStudyView
import com.example.latihanucp2.ui.screen.SplashView
import com.example.latihanucp2.ui.viewmodel.MahasiswaViewModel
import com.example.latihanucp2.ui.viewmodel.RencanaStudyViewModel


enum class Halaman{
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}

