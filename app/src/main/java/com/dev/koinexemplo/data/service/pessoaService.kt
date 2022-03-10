package com.dev.koinexemplo.data

/*
* Nome: Renan Costa e Silva
* Data: 27/02/2022
* Versão: 1.0
* Descrição: Interface de serviço  da classePessoa
* Interfaces não podem ser instanciadas , somente implementadas e os métodos
* só podem ter o corpo. Por isso com koin deve haver uma classe de implementação
* neste caso é a class PessoaSeviceImpl
* Projeto: KoinExemplo
* */
interface PessoaService{

    fun hello(): String

}