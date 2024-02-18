package com.example.my_portifoli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_portifoli.databinding.ActivityTelaContatorBinding

class Tela_contator : AppCompatActivity() {

     private lateinit var binding: ActivityTelaContatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTelaContatorBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val toobarContato = binding.btVoltarContator
        toobarContato.setNavigationOnClickListener{
            finish()
        }

    }
}