package Exercicios_21_09.exercicio_1.exercicio_2;

import java.util.ArrayList;
import java.util.Scanner;

public class classe {

    public static void main(String[] args) {

        ArrayList<estudante> estudantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escola do Gordinho");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Mostrar resultados");
            System.out.println("0. Sair");
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite a idade: ");
                    int idade = scanner.nextInt();

                    System.out.print("Digite a primeira nota: ");
                    double nota1 = scanner.nextDouble();

                    System.out.print("Digite a segunda nota: ");
                    double nota2 = scanner.nextDouble();

                    estudante aluno = new estudante(nome, idade, nota1, nota2);
                    estudantes.add(aluno);

                    System.out.println("Aluno cadastrado!");
                    break;
                }

                case 2: {
                    if (estudantes.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                        break;
                    }

                    int aprovados = 0;
                    double maiorMedia = estudantes.get(0).calcularMedia();

                    for (estudante aluno : estudantes) {
                        aluno.exibirSituacao();

                        if (aluno.verificarAprovacao() == true) {
                            aprovados++;
                        }

                        if (aluno.calcularMedia() > maiorMedia) {
                            maiorMedia = aluno.calcularMedia();
                        }
                    }

                    System.out.println("Alunos aprovados: " + aprovados);
                    System.out.println("Maior média: " + maiorMedia);
                    break;
                }

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}