package com.example.projet_mobile

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        //Declaration de mon bouton
        var Retour : ImageButton = findViewById(R.id.imageBtn)


            // creation de notre intent
        val monIntentRetour : Intent =  Intent(this,MainActivity::class.java)

            //clic sur le bouton
        Retour.setOnClickListener {
            startActivity(monIntentRetour)

        }
    }
}