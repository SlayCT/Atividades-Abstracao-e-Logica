package br.edu.fatecpg.atividade.model;

public class Carro {

    private String marca;
    private double consumo;
    private double combustivel;

    public Carro(String marca, double consumo, double combustivel) {
        this.marca = marca;
        this.consumo = consumo;
        this.combustivel = combustivel;
    }

    public double calcularAutonomia() {
        return consumo * combustivel;
    }

    public double simularViagem(double distancia) {
        double gasto = distancia / consumo;
        return combustivel - gasto;
    }

    public double abastecer(double litros) {
        return combustivel + litros;
    }

    public String getMarca() {
        return marca;
    }
}