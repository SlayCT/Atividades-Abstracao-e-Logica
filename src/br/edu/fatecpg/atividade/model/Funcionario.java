package br.edu.fatecpg.atividade.model;

public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double aplicarAumento(double percentual) {
        return salario + (salario * percentual / 100);
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public String getNome() {
        return nome;
    }
}