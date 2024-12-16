package com.example.teste

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.example.teste.components.ListaPostosComponente

@Composable
fun HomeScreen(navController: NavHostController, paddingValues: PaddingValues) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {

        ListaPostosComponente(
            onPostoClick = { postoId ->
                navController.navigate("detalhesPosto/$postoId") // Redireciona para a tela de detalhes
            }
        )
    }
}
