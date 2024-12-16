package com.example.teste.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.teste.negocio.ListaPostos

@Composable
fun ListaPostosComponente(onPostoClick: (Int) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp) // Espaçamento entre os cards
    ) {
        for (posto in ListaPostos) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onPostoClick(posto.id) }, // Navegar ou exibir detalhes ao clicar no card
                elevation = 4.dp,
                backgroundColor = Color(0xFFF1F130),
                shape = RoundedCornerShape(8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = posto.nome,
                        fontSize = 18.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Text(
                        text = posto.endereco,
                        fontSize = 14.sp,
                        color = Color.DarkGray,
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
    }
}