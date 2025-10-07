package br.com.catolica.criar_conta.model;

import br.com.catolica.criar_conta.contracts.IAutentocacao;

import java.time.LocalDate;

abstract public class Pessoa implements IAutentocacao {

    private String nome;
    private String matricula;
    private String documento;
    private LocalDate dataNascimento;
    private String senha;

    Pessoa(){}

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }

    public String getDocumento(){
        return this.documento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento(){
        return this.dataNascimento.toString();
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    @Override
    public boolean login(String senha){
        return false;
    }

    @Override
    public boolean logout(){
        return false;
    }
}
