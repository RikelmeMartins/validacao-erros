package br.com.catolica.criar_conta.model;

import br.com.catolica.criar_conta.contracts.IAutentocacao;
import br.com.catolica.criar_conta.exceptions.CredenciasInvalidasException;
import br.com.catolica.criar_conta.exceptions.SenhaInvalidaException;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Base64;
import java.util.UUID;

abstract public class Pessoa implements IAutentocacao {

    private String nome;
    private String matricula;
    private String documento;
    private LocalDate dataNascimento;
    private String senha;
    private boolean logado;

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
        String docPesudoOculto = Base64.getEncoder().encodeToString(documento.getBytes());
        System.out.printf("DOC BASE64: %s\n", docPesudoOculto);
        this.documento = docPesudoOculto;
    }

    public String getDocumento(){
        String docAberto = Base64.getDecoder().decode(this.documento).toString();
        return this.documento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento(){
        return this.dataNascimento.toString();
    }

    public void setSenha(String senha){
        if (senha.length() < 8){
            throw new SenhaInvalidaException();
        }
        this.senha = Base64.getEncoder().encodeToString(senha.getBytes());
        //this.senha = UUID.fromString(senha).toString();
    }

    @Override
    public boolean login(String senha){
        String senhaOculta = Base64.getEncoder().encodeToString(senha.getBytes());
        if (this.senha.equals(senhaOculta)){
            this.logado = true;
            return true;
        }

        throw new CredenciasInvalidasException();
    }

    @Override
    public boolean logout(){
        this.logado = false;
        return true;
    }
}
