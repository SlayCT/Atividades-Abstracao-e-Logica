package br.edu.fatecpg.atividade.model;

public class Viagem {

    private double distancia;
    private double consumo;
    private double preco;

    public Viagem(double distancia, double consumo, double preco) {
        this.distancia = distancia;
        this.consumo = consumo;
        this.preco = preco;
    }

    public double calcularLitros() {
        return distancia / consumo;
    }

    public double calcularCusto() {
        return calcularLitros() * preco;
    }
}