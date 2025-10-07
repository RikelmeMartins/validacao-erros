package br.com.catolica.criar_conta.model;

import br.com.catolica.criar_conta.enums.StatusMatricula;

public class Aluno extends Pessoa{

    private StatusMatricula statusMatricula;

    public Aluno(){}

    public void setStatusMatricula(StatusMatricula statusMatricula){
        this.statusMatricula = statusMatricula;
    }

    public StatusMatricula getStatusMatricula(){
        return this.statusMatricula;
    }

}
