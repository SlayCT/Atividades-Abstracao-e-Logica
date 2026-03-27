package br.edu.fatecpg.atividade.view;

import br.edu.fatecpg.atividade.model.Retangulo;
import br.edu.fatecpg.atividade.model.Funcionario;
import br.edu.fatecpg.atividade.model.ContaBancaria;
import br.edu.fatecpg.atividade.model.Produto;
import br.edu.fatecpg.atividade.model.Aluno;
import br.edu.fatecpg.atividade.model.Carro;
import br.edu.fatecpg.atividade.model.Temperatura;
import br.edu.fatecpg.atividade.model.Esfera;
import br.edu.fatecpg.atividade.model.Vendedor;
import br.edu.fatecpg.atividade.model.ContaEnergia;
import br.edu.fatecpg.atividade.model.Viagem;
import br.edu.fatecpg.atividade.model.Pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n\n==================================");
            System.out.println("       Exercícios de Abstração    ");
            System.out.println("==================================");
            System.out.println("1 - Retângulo");
            System.out.println("2 - Funcionário");
            System.out.println("3 - Conta Bancária");
            System.out.println("4 - Produto");
            System.out.println("5 - Aluno");
            System.out.println("6 - Carro");
            System.out.println("7 - Temperatura");
            System.out.println("8 - Esfera");
            System.out.println("9 - Vendedor");
            System.out.println("10 - Conta de Energia");
            System.out.println("11 - Viagem");
            System.out.println("12 - Pessoa / IMC");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1: {
                    System.out.println("\n--- Retângulo ---");
                    System.out.print("Digite a largura: ");
                    double largura = sc.nextDouble();

                    System.out.print("Digite a altura: ");
                    double altura = sc.nextDouble();

                    Retangulo r = new Retangulo(largura, altura);

                    System.out.println("Área: " + r.calcularArea());
                    System.out.println("Perímetro: " + r.calcularPerimetro());
                    break;
                }

                case 2: {
                    System.out.println("\n--- Funcionário ---");
                    sc.nextLine();

                    System.out.print("Digite o nome do funcionário: ");
                    String nomeFuncionario = sc.nextLine();

                    System.out.print("Digite o salário inicial: ");
                    double salario = sc.nextDouble();

                    System.out.print("Digite o percentual de aumento: ");
                    double percentual = sc.nextDouble();

                    Funcionario f = new Funcionario(nomeFuncionario, salario);

                    System.out.println("Funcionário: " + f.getNome());
                    System.out.println("Salário com aumento: " + f.aplicarAumento(percentual));
                    System.out.println("Salário anual: " + f.calcularSalarioAnual());
                    break;
                }

                case 3: {
                    System.out.println("\n--- Conta Bancária ---");
                    sc.nextLine();

                    System.out.print("Digite o nome do titular: ");
                    String titular = sc.nextLine();

                    System.out.print("Digite o saldo inicial: ");
                    double saldoInicial = sc.nextDouble();

                    System.out.print("Digite o valor do depósito: ");
                    double deposito = sc.nextDouble();

                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();

                    ContaBancaria conta = new ContaBancaria(titular, saldoInicial);

                    System.out.println("Titular: " + conta.getTitular());
                    System.out.println("Saldo inicial: " + conta.getSaldo());
                    System.out.println("Saldo após depósito: " + conta.depositar(deposito));
                    System.out.println("Saldo após saque: " + conta.sacar(saque));
                    break;
                }

                case 4: {
                    System.out.println("\n--- Produto ---");
                    sc.nextLine();

                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = sc.nextLine();

                    System.out.print("Digite o preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Digite a quantidade em estoque: ");
                    int quantidade = sc.nextInt();

                    System.out.print("Digite a quantidade de entrada: ");
                    int entrada = sc.nextInt();

                    System.out.print("Digite a quantidade de saída: ");
                    int saida = sc.nextInt();

                    Produto p = new Produto(nomeProduto, preco, quantidade);

                    System.out.println("Produto: " + p.getNome());
                    System.out.println("Valor total em estoque: " + p.calcularValorTotal());
                    System.out.println("Quantidade após entrada: " + p.entrada(entrada));
                    System.out.println("Quantidade após saída: " + p.saida(saida));
                    break;
                }

                case 5: {
                    System.out.println("\n--- Aluno ---");
                    sc.nextLine();

                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.print("Digite a primeira nota: ");
                    double n1 = sc.nextDouble();

                    System.out.print("Digite a segunda nota: ");
                    double n2 = sc.nextDouble();

                    System.out.print("Digite a terceira nota: ");
                    double n3 = sc.nextDouble();

                    Aluno a = new Aluno(nomeAluno, n1, n2, n3);

                    System.out.println("Aluno: " + a.getNome());
                    System.out.println("Média final: " + a.calcularMedia());
                    System.out.println("Situação: " + a.verificarAprovacao());
                    break;
                }

                case 6: {
                    System.out.println("\n--- Carro ---");
                    sc.nextLine();

                    System.out.print("Digite a marca do carro: ");
                    String marca = sc.nextLine();

                    System.out.print("Consumo do carro (km/l): ");
                    double consumoCarro = sc.nextDouble();

                    System.out.print("Combustível atual (litros): ");
                    double combustivelAtual = sc.nextDouble();

                    Carro carro = new Carro(marca, consumoCarro, combustivelAtual);

                    System.out.println("Marca: " + carro.getMarca());
                    System.out.println("Autonomia atual: " + carro.calcularAutonomia() + " km");

                    System.out.print("Digite a distância da viagem: ");
                    double distancia = sc.nextDouble();
                    System.out.println("Combustível restante após viagem: " + carro.simularViagem(distancia));

                    System.out.print("Quantos litros deseja abastecer? ");
                    double litros = sc.nextDouble();
                    System.out.println("Combustível após abastecer: " + carro.abastecer(litros));
                    break;
                }

                case 7: {
                    System.out.println("\n--- Temperatura ---");
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = sc.nextDouble();

                    Temperatura temp = new Temperatura(celsius);

                    System.out.println("Celsius: " + temp.getCelsius() + " °C");
                    System.out.println("Fahrenheit: " + temp.paraFahrenheit() + " °F");
                    System.out.println("Kelvin: " + temp.paraKelvin() + " K");
                    break;
                }

                case 8: {
                    System.out.println("\n--- Esfera ---");
                    System.out.print("Digite o raio da esfera: ");
                    double raio = sc.nextDouble();

                    Esfera esfera = new Esfera(raio);

                    System.out.println("Volume: " + esfera.calcularVolume());
                    System.out.println("Área da superfície: " + esfera.calcularArea());
                    break;
                }

                case 9: {
                    System.out.println("\n--- Vendedor ---");
                    sc.nextLine();

                    System.out.print("Nome do vendedor: ");
                    String nomeVendedor = sc.nextLine();

                    System.out.print("Salário base: ");
                    double salarioBase = sc.nextDouble();

                    System.out.print("Total de vendas no mês: ");
                    double totalVendas = sc.nextDouble();

                    System.out.print("Percentual de comissão: ");
                    double percentualComissao = sc.nextDouble();

                    Vendedor vendedor = new Vendedor(nomeVendedor, totalVendas, percentualComissao);

                    System.out.println("Vendedor: " + nomeVendedor);
                    System.out.println("Comissão: " + vendedor.calcularComissao());
                    System.out.println("Salário final: " + vendedor.salarioFinal(salarioBase));
                    break;
                }

                case 10: {
                    System.out.println("\n--- Conta de Energia ---");
                    System.out.print("Consumo do mês (kWh): ");
                    double consumoEnergia = sc.nextDouble();

                    System.out.print("Valor por kWh: ");
                    double valorKwh = sc.nextDouble();

                    ContaEnergia contaLuz = new ContaEnergia(consumoEnergia, valorKwh);

                    System.out.println("Valor total: " + contaLuz.calcularTotal());
                    System.out.println("Valor com 15% de desconto: " + contaLuz.calcularComDesconto(15));
                    break;
                }

                case 11: {
                    System.out.println("\n--- Viagem ---");
                    System.out.print("Distância da viagem (km): ");
                    double distanciaViagem = sc.nextDouble();

                    System.out.print("Consumo do carro (km/l): ");
                    double consumoViagem = sc.nextDouble();

                    System.out.print("Preço do combustível: ");
                    double precoCombustivel = sc.nextDouble();

                    Viagem viagem = new Viagem(distanciaViagem, consumoViagem, precoCombustivel);

                    System.out.println("Litros necessários: " + viagem.calcularLitros());
                    System.out.println("Custo total: " + viagem.calcularCusto());
                    break;
                }

                case 12: {
                    System.out.println("\n--- Pessoa / IMC ---");
                    sc.nextLine();

                    System.out.print("Nome do paciente: ");
                    String nomePaciente = sc.nextLine();

                    System.out.print("Peso (kg): ");
                    double peso = sc.nextDouble();

                    System.out.print("Altura (m): ");
                    double alturaPessoa = sc.nextDouble();

                    Pessoa pessoa = new Pessoa(nomePaciente, peso, alturaPessoa);

                    System.out.println("Paciente: " + nomePaciente);
                    System.out.println("IMC: " + pessoa.calcularIMC());
                    System.out.println("Classificação: " + pessoa.classificar());
                    break;
                }

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}