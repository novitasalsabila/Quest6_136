package com.example.latihanucp2.ui.screen

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihanucp2.model.Mahasiswa
import com.example.latihanucp2.model.RencanaStudi

@Composable
fun DetailView(
    mahasiswa: Mahasiswa,
    rencanaStudi: RencanaStudi,
    onBackButtonClicked: () -> Unit,
    onResetButtonClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        // Judul bagian data mahasiswa
        Text("Detail Mahasiswa", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        // Menampilkan data Mahasiswa
        DetailRow(label = "Nama", value = mahasiswa.nama)
        DetailRow(label = "NIM", value = mahasiswa.nim)
        DetailRow(label = "Email", value = mahasiswa.email)

        Spacer(modifier = Modifier.padding(8.dp))

        // Menampilkan Rencana Studi
        Text("Rencana Studi", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        DetailRow(label = "Mata Kuliah", value = rencanaStudi.mataKuliah)
        DetailRow(label = "Kelas", value = rencanaStudi.kelas)

        Spacer(modifier = Modifier.padding(8.dp))


    }


}

@Composable
fun DetailRow(label: String, value: String) {

}