package com.dev.koinexemplo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import com.dev.koinexemplo.R
import com.dev.koinexemplo.container.PessoaAplication
import com.dev.koinexemplo.data.PessoaService
import com.dev.koinexemplo.di.pessoaModule
import org.koin.core.context.startKoin

// link = https://www.youtube.com/watch?v=ESjH8PsCh1w
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()

    }

    /*
    * Nome: Renan Costa e Silva
    * Data: 27/02/2022
    * Versão: 1.0
    * Descrição: Inicialização do koin no Main do projeto
    * Projeto: KoinExemplo
    * */
    private fun main() {
        startKoin {
            modules(pessoaModule)
            printLogger()
        }
        PessoaAplication(this).sayHello()
    }

}