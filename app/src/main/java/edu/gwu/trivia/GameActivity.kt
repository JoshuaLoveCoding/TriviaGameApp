package edu.gwu.trivia

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val gameData = intent.getParcelableExtra<GameData>("gameData")
    }
}
