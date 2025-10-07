package br.com.catolica.criar_conta.exceptions;

public class SenhaInvalidaException extends RuntimeException {
    public SenhaInvalidaException() {
        super("A senha deve ter no minimo 8 caracteres.");
    }
}
