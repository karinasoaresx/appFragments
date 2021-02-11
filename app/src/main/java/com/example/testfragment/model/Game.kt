package com.example.testfragment.model

import android.graphics.drawable.Drawable

// Classe para definir as informações dos jogos (Class to define game information)
data class Game(
    var id: Long,
    var gameName: String,
    var gameImage: Drawable,
    var gameDescription: String,
    var gameRating: Float,
    var console: List<Console> //Lista de consoles que o jogo terá (List<console> é um atributo dos consoles)
)   /*{
        Aqui usaremos apenas para fazer uma função  
    }*/