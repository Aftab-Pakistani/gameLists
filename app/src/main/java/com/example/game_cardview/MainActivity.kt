package com.example.game_cardview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        var gameList: ArrayList<GameModel> = ArrayList()

        val g1 = GameModel(R.drawable.g1, "Left4dead")
        val g2 = GameModel(R.drawable.g2, "NFS")
        val g3 = GameModel(R.drawable.g3, "CSGO")
        val g4 = GameModel(R.drawable.g4, "Left4dead2")
        val g5 = GameModel(R.drawable.g5, "B4B")
        val g6 = GameModel(R.drawable.g6, "Pubg")
        val g7 = GameModel(R.drawable.g7, "Fortnite")
        val g8 = GameModel(R.drawable.g8, "Doom")

        gameList.add(g1)
        gameList.add(g2)
        gameList.add(g3)
        gameList.add(g4)
        gameList.add(g5)
        gameList.add(g6)
        gameList.add(g7)
        gameList.add(g8)

        val adapter = GameAdapter(gameList)
        recyclerView.adapter = adapter
    }
}