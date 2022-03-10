package com.dev.koinexemplo.container

import android.content.Context
import android.widget.Toast
import com.dev.koinexemplo.data.PessoaService
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class PessoaAplication(private val context: Context) : KoinComponent {

    // Inject HelloService
    private val pessoaService: PessoaService by inject()

    // display our data
    //fun sayHello() = println(pessoaService.hello())
    fun sayHello() = Toast.makeText(context , "${pessoaService.hello()}" , Toast.LENGTH_LONG).show()

}