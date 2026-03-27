package br.edu.fatecpg.atividade.model;

public class Esfera {

    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public double calcularArea() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }
}