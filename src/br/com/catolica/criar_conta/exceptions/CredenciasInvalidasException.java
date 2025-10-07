package br.com.catolica.criar_conta.exceptions;

public class CredenciasInvalidasException extends RuntimeException {
    public CredenciasInvalidasException() {
        super("Senha e/ou o login estão inválidas.");
    }
}
