package com.example.my_portifoli

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.example.my_portifoli.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val minhaFoto = BitmapFactory.decodeResource(resources,R.drawable.cleber_geraldo)
        val circulo = RoundedBitmapDrawableFactory.create(resources,minhaFoto)
        circulo.isCircular = true
        binding.MinhaFotos.setImageDrawable(circulo)

        binding.btProjeto1.setOnClickListener{
            var intent = Intent(this,Tela_Progeto::class.java)
            startActivity(intent)
        }
        binding.btContator.setOnClickListener{
            var intent = Intent(this,Tela_contator::class.java)
        }
    }
}