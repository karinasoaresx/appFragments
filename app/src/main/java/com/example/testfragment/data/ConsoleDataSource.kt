package com.example.testfragment.data

import android.content.Context
import com.example.testfragment.model.Console

class ConsoleDataSource {
//Não preciso instanciar o GameDataSource porque tudo está dentro de um objeto

    companion object {
        fun getConsoles(context: Context): ArrayList<Console> {

            var console = ArrayList<Console>()

            //Cada campo mencionado aqui é equivalente aos campos escritos no arquivo game(1 = id, "Call of Duty" = nome do jogo e etc). Obrigatóriamente deve seguir a sequência declarada no arquivo principal
            console.add(
                Console(
                    1,
                    "XBOX 360",
                    "Microsoft",
                    "22/11/2005"
                )
            )

            console.add(
                Console(
                    2,
                    "XBOX ONE",
                    "Microsoft",
                    "22/11/2013"
                )
            )

            console.add(
                Console(
                    3,
                    "XBOX ONE S",
                    "Microsoft",
                    "22/09/2017"
                )
            )

            console.add(
                Console(
                    4,
                    "XBOX ONE X",
                    "Microsoft",
                    "22/09/2017"
                )
            )

            return console
        }
    }
}