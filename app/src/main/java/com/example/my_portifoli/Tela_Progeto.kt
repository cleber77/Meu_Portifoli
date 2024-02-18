package com.example.my_portifoli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_portifoli.databinding.ActivityTelaProgetoBinding

class Tela_Progeto : AppCompatActivity() {

    private lateinit var binding: ActivityTelaProgetoBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding= ActivityTelaProgetoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val telaProgeto = binding.btVoltarProgeto
        telaProgeto.setNavigationOnClickListener{
            finish()
        }


    }
}