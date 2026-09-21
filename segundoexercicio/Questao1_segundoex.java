package segundoexercicio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1_segundoex {

    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos da sala:");
        try {
            int quantidadeAlunos = entrada.nextInt();
            int quantidadeNotas = 0;
            int contador = 0;
            double [] notas = new double[quantidadeAlunos];
            double menor = 10;
            double maior = 0;
            double soma = 0;

           for(int i = 0; i < quantidadeAlunos; i++) {
                System.out.println("Digite a nota do aluno " + (contador + 1) + ":");
                double nota = entrada.nextDouble();
                notas[contador] = nota;
                quantidadeNotas++;
                contador++;
                soma += notas[i];
                if(nota < menor) {
                    menor = nota;
                }
                if(nota > maior) {
                    maior = nota;
                }
                if(nota < 6 ){
                    System.out.println("O aluno " + (contador) + " está reprovado.");
                } else {
                    System.out.println("O aluno " + (contador) + " está aprovado.");
                }
            }

            System.out.println("A menor nota da sala é: " + menor);
            System.out.println("A maior nota da sala é: " + maior);
            System.out.println("A média da sala é: " + (soma / quantidadeNotas));
        } catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números inteiros.");
        } finally {
            entrada.close();
        }
    }

}
