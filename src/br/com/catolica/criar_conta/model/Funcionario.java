package br.com.catolica.criar_conta.model;

abstract class Funcionario extends Pessoa{

    private int salario;
    private int valorHoraAula;
    private int cargaHoraria;
    private int DIAS_TRABALHADO_SEMANA = 5;

    public Funcionario(){}

    public void setValorHoraAula(int valorHoraAula){
        this.valorHoraAula = valorHoraAula;
    }

    public int getValorHoraAula(){
        return this.valorHoraAula;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria(){
        return this.cargaHoraria;
    }

    public double calcularSalario(){
        int sal = ((this.getValorHoraAula() * this.getCargaHoraria()) * DIAS_TRABALHADO_SEMANA) * 4;


        return salario;
    }
}
