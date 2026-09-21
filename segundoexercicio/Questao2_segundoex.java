package segundoexercicio;
import java.util.InputMismatchException;
import java.util.Scanner;

    public class Questao2_segundoex {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int[] numeros = new int[10];

        try {

            for(int i = 0; i < 10; i++) {

                System.out.println("Digite o número: " + (i + 1) + ":");
                numeros[i] = entrada.nextInt();

            }

            System.out.println("Digite o número que deseja procurar:");
            int numeroProcurado = entrada.nextInt();

            boolean encontrado = false;

            for(int i = 0; i < 10; i++) {

                if(numeros[i] == numeroProcurado) {

                    System.out.println("Número encontrado na posição " + (i + 1));
                    encontrado = true;

                }

            }

            if(encontrado == false) {

                System.out.println("O número não foi localizado.");

            } else {

                System.out.println("Busca finalizada.");

            }

        } catch (InputMismatchException e) {

            System.out.println("Erro: digite apenas números inteiros.");

        } finally {

            entrada.close();

        }

    }

}