package com.dev.koinexemplo.di

import com.dev.koinexemplo.data.PessoaService
import com.dev.koinexemplo.data.model.Pessoa
import com.dev.koinexemplo.data.service.PessoaServiceImpl
import org.koin.dsl.module


/*
* Nome: Renan Costa e Silva
* Data: 27/02/2022
* Versão: 1.0
* Descrição: Modulo koin da classe Pessoa
* Projeto: KoinExemplo
* */
val pessoaModule = module {

    single { Pessoa() }
    single<PessoaService>{ PessoaServiceImpl(get()) }

}