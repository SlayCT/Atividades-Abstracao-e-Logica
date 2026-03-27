package br.edu.fatecpg.atividade.model;

public class Temperatura {

    private double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double paraFahrenheit() {
        return (celsius * 1.8) + 32;
    }

    public double paraKelvin() {
        return celsius + 273.15;
    }

    public double getCelsius() {
        return celsius;
    }
}