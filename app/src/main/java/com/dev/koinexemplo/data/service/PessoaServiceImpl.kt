package com.dev.koinexemplo.data.service

import com.dev.koinexemplo.data.PessoaService
import com.dev.koinexemplo.data.model.Pessoa

/*
* Nome: Renan Costa e Silva
* Data: 27/02/2022
* Versão: 1.0
* Descrição: Implementação do serviço da Interface.
* Projeto: KoinExemplo
* */
class PessoaServiceImpl(private val pessoaMessageData: Pessoa): PessoaService

{
    override fun hello(): String {
       return "Hey, ${pessoaMessageData.mensagem}"
    }
}