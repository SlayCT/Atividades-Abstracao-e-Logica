package br.edu.fatecpg.atividade.model;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double depositar(double valor) {
        return saldo + valor;
    }

    public double sacar(double valor) {
        return saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}