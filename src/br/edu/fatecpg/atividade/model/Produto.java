package br.edu.fatecpg.atividade.model;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public int entrada(int qtd) {
        return quantidade + qtd;
    }

    public int saida(int qtd) {
        return quantidade - qtd;
    }

    public String getNome() {
        return nome;
    }
}