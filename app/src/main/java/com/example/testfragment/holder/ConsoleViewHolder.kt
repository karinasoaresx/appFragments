package com.example.testfragment.holder

import android.view.ContextThemeWrapper
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.model.Console
import kotlinx.android.synthetic.main.holder_game_layout.view.*

/* tudo que a RecyclerView tem, a GameViewHolder tbm tem */
class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val textConsoleName          = itemView.findViewById<TextView>(R.id.text_view_console_name)
    val textConsoleDeveloperName = itemView.findViewById<TextView>(R.id.text_view_developer_name)
    val textConsoleReleaseDate   = itemView.findViewById<TextView>(R.id.text_view_developer_date)
    //val consoleImage              = itemView.findViewById<ImageView>(R.id.image_console)

    fun bind(console: Console) {
        textConsoleName.text          = console.consoleName
        textConsoleDeveloperName.text = console.consoleMakerName
        textConsoleReleaseDate.text   = console.consoleReleaseDate
        //consoleImage.setImageDrawable(console.consoleImage)

    }
}













