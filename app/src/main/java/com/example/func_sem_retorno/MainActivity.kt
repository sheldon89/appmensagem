package com.example.func_sem_retorno

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_enviar.setOnClickListener(){
            menssagem()
        }
    }
    fun menssagem(){

        val msg = edt_msg.text.toString()
        tv_resultado.text= msg
    }
}