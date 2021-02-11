package com.example.testfragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.adapter.ConsoleAdapter
import com.example.testfragment.adapter.GameAdapter
import com.example.testfragment.data.ConsoleDataSource
import com.example.testfragment.data.GameDataSource
import com.example.testfragment.model.Console
import com.example.testfragment.model.Game

class ConsolesFragment : Fragment() {

    private lateinit var recyclerConsole : RecyclerView
    private val consoleAdapter = ConsoleAdapter()
    private var consoleList = listOf<Console>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_games, container, false)

        //instanciar a RecyclerView
        recyclerConsole = view.findViewById(R.id.recycler_view_consoles)

        //determinar a orientação da RecyclerView(se vai listar na horizontal ou na vertical)
        recyclerConsole.layoutManager = LinearLayoutManager(view.context)

        //informar para a RecyclerView qual eh o adapter que ela vai usar
        recyclerConsole.adapter = consoleAdapter

        //dizer ao adapter qual eh a fonte de dados
        consoleList = ConsoleDataSource.getConsoles(view.context)

        //atualizar a lista de jogos do adapter
        consoleAdapter.updateConsoleList(consoleList)

        //tornar o menu visivel
        setHasOptionsMenu(true)

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.menu_console, menu)
    }
    
}