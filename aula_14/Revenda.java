package aula_14;

import java.util.Scanner;

public class Revenda {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Revenda do Godinho");
        System.out.println("1. Cadastrar carro");
        System.out.println("2. Vender carro");
        System.out.println("3. Listar carros");
        System.out.print("Digite a opção desejada: ");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // limpa a quebra de linha

        switch(opcao) {
            case 1:
                cadastrarCarro(scanner, carros);
                break;

            case 2:
                venderCarro(scanner, carros);
                break;

            case 3:
                listarCarros(carros);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    public static void cadastrarCarro(Scanner scanner, ArrayList<Carro> carros ) {
        System.out.print("Digite a cor do carro: ");
        String cor = scanner.nextLine();1

        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();

        System.out.print("Digite a placa do carro: ");
        String placa = scanner.nextLine();

        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();

        System.out.print("Carro está em estoque? (true/false): ");
        boolean estoque = scanner.nextBoolean();

        Carro carro = new Carro(cor, ano, marca, placa);
        carro.estoque = estoque;

        System.out.println("Carro cadastrado com sucesso!");
        System.out.println(
            carro.cor + " " +
            carro.ano + " " +
            carro.marca + " " +
            carro.placa + " " +
            (carro.estoque ? "Sim" : "Não")
        );
    }

    public static void venderCarro(Scanner scanner) {
        System.out.println("Opção de venda selecionada.");
    }

    public static void listarCarros() {
        System.out.println("Opção de listagem selecionada.");
    }
}