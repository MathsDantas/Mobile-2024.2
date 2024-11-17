package com.example.profileapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializando componentes
        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val nameText = findViewById<TextView>(R.id.nameText)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)
        val currentJobText = findViewById<TextView>(R.id.currentJobText)
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)

        // Definindo informações de perfil
        nameText.text = "Cristiano Ronaldo"
        descriptionText.text = "Terceiro maior jogador de futebol de todos os tempos."
        currentJobText.text = "Clube atual: Al-Nassr"

        // Lista de experiências
        val experiencias = listOf(
            "Mais jogos nas competições de clubes da UEFA: 197",
            "Mais golos nas competições de clubes da UEFA: 145",
            "Mais golos na UEFA Champions League: 140",
            "Mais golos numa só edição da UEFA Champions League: 17 (2013/14)",
            "Mais golos na fase a eliminar da UEFA Champions League: 67",
            "Melhor marcador da UEFA Champions League: 2007/08, 2012/13, 2013/14, 2015/16, 2016/17, 2017/18",
            "Mais jogos na UEFA Champions League: 183",
            "Mais vitórias na final da UEFA Champions League: 5",
            "Único jogador a marcar em três finais da UEFA Champions League",
            "Um dos dois jogadores a marcar nos seis jogos da fase de grupos da UEFA Champions League",
            "Único jogador a marcar em 11 jogos seguidos na UEFA Champions League",
            "Mais prémios de Melhor Jogador da UEFA: 4 (2008, 2014, 2016, 2017)",
            "Mais presenças na Equipa do Ano dos utilizadores do UEFA.com: 15 (2004, 2007–2020)"
        )

        // Adicionando experiências dinamicamente
        for (experiencia in experiencias) {
            val textView = TextView(this)
            textView.text = experiencia
            textView.textSize = 17f
            experienceLayout.addView(textView)
        }
    }
}
