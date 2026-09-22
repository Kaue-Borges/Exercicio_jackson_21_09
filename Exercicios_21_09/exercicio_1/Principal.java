package Exercicios_21_09.exercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        ArrayList<produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nEcommerce do gordo");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Adicionar estoque");
            System.out.println("3. Remover estoque");
            System.out.println("4. Listar produtos");
            System.out.println("5. Valor do estoque");
            System.out.println("0. Sair");
            System.out.print("Informe a opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.print("Qual o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Informe o preço do produto: ");
                    float preco = scanner.nextFloat();

                    System.out.print("Informe a quantidade: ");
                    int quantidade = scanner.nextInt();

                    produto novoProduto = new produto(nome, preco, quantidade);
                    produtos.add(novoProduto);

                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                }

                case 2: {
                    System.out.print("Informe o nome do produto: ");
                    String nomeCompra = scanner.nextLine();

                    System.out.print("Informe a quantidade de entrada: ");
                    int quantidadeCompra = scanner.nextInt();

                    for (produto produtoCompra : produtos) {
                        if (produtoCompra.nome.equals(nomeCompra)) {
                            produtoCompra.adicionarEstoque(quantidadeCompra);
                            System.out.println("Estoque adicionado com sucesso!");
                            break;
                        }
                    }

                    break;
                }

                case 3: {
                    System.out.print("Informe o nome do produto: ");
                    String nomeVenda = scanner.nextLine();

                    System.out.print("Informe a quantidade de saidas desse produto: ");
                    int quantidadeVenda = scanner.nextInt();

                    for (produto produtoVenda : produtos) {
                        if (produtoVenda.nome.equals(nomeVenda)) {
                            produtoVenda.removerEstoque(quantidadeVenda);
                            System.out.println("Removido do estoque");
                            break;
                        }
                    }

                    break;
                }
                case 4:{
                    System.out.println("Lista de produtos cadastrados:");
                    for (produto produto : produtos) {
                        produto.exibirDados();
                        System.out.println("--------------------");
                    }
                    break;
                }
                case 5: {
                    double valorTotalEstoque = 0;
                    for (produto produto : produtos) {
                        valorTotalEstoque += produto.calcularValorEstoque();
                    }
                    System.out.println("Valor total do estoque: " + valorTotalEstoque);
                    break;
                }

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção ainda não implementada ou inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}