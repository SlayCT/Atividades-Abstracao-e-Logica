package br.edu.fatecpg.atividade.model;

public class Vendedor {

    private String nome;
    private double totalVendas;
    private double percentual;

    public Vendedor(String nome, double totalVendas, double percentual) {
        this.nome = nome;
        this.totalVendas = totalVendas;
        this.percentual = percentual;
    }

    public double calcularComissao() {
        return totalVendas * (percentual / 100);
    }

    public double salarioFinal(double salarioBase) {
        return salarioBase + calcularComissao();
    }
}