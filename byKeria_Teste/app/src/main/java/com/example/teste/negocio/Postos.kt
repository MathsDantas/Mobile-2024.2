package com.example.teste.negocio

data class Posto(
    val id: Int,
    val nome: String,
    val endereco: String
)

val ListaPostos = listOf(
    Posto(
        id = 1,
        nome = "Central",
        endereco = "Rua Central, 100"
    ),
    Posto(
        id = 2,
        nome = "Norte",
        endereco = "Avenida Norte, 200"
    ),
    Posto(
        id = 3,
        nome = "Sul",
        endereco = "Praça Sul, 300"
    )
)
