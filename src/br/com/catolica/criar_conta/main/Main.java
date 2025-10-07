package br.com.catolica.criar_conta.main;

import br.com.catolica.criar_conta.enums.StatusMatricula;
import br.com.catolica.criar_conta.exceptions.CredenciasInvalidasException;
import br.com.catolica.criar_conta.exceptions.SenhaInvalidaException;
import br.com.catolica.criar_conta.exceptions.StatusMatriculaException;
import br.com.catolica.criar_conta.model.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();

        try {
            aluno.setDocumento("0000000000");
            aluno.setSenha("12345678");

            boolean statusLogin = aluno.login("123456789");
            System.out.println(statusLogin);
        } catch (SenhaInvalidaException | CredenciasInvalidasException e){
            System.err.println(e.getMessage());
        }
        /*
        System.out.println("Qual status da matricula do aluno? ");

        try {

            for (int i = 0; i < StatusMatricula.values().length; i++){
                System.out.printf("[%d] %s\n", i, StatusMatricula.values()[i]);
            }

            byte status = entrada.nextByte();

            if (status < 0 || status > StatusMatricula.values().length-1){
                throw new StatusMatriculaException();
            }

            aluno.setStatusMatricula(StatusMatricula.values()[status]);
            System.out.println(aluno.getStatusMatricula());

        } catch (StatusMatriculaException e){
           System.err.println(e.getMessage());
        }
         */
    }
}
