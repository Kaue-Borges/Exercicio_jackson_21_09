package primeiroexercicio;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ContarDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println("Digite um número inteiro: ");
            int digito = entrada.nextInt();

            String strDigito = Integer.toString(digito).replace("-", "");
            int contador = 0;

            for(int i = 0; i < strDigito.length(); i++) {
                contador++;
            }

            System.out.println("A quantidade de dígitos é: " + contador);
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número inteiro dentro do limite de int.");
        } finally {
            entrada.close();
        }
    }
}