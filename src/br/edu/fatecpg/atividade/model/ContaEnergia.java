package br.edu.fatecpg.atividade.model;

public class ContaEnergia {

    private double consumo;
    private double valorKwh;

    public ContaEnergia(double consumo, double valorKwh) {
        this.consumo = consumo;
        this.valorKwh = valorKwh;
    }

    public double calcularTotal() {
        return consumo * valorKwh;
    }

    public double calcularComDesconto(double porcentagem) {
        return calcularTotal() * (1 - porcentagem / 100);
    }
}