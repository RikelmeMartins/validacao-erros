package br.com.catolica.criar_conta.contracts;

public interface IAutentocacao {
    //login
    boolean login(String senha);
    //logout
    boolean logout();

}
