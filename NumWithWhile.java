import java.util.InputMismatchException;
import java.util.Scanner;

public class NumWithWhile {
  
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);    
        try{

            System.out.println("Digite os numeros para soma:");
            int numero = entrada.nextInt(); 
            int soma = 0;
            while (true) {
                System.out.println(" Digite o número: ");
                numero = entrada.nextInt();

                if (numero == 0){
                    break;
                }

                soma += numero;
            }
            entrada.close();
            System.out.println("A soma dos numero é:" + soma);
        } catch (InputMismatchException e) {
 
            System.out.println("Erro: digite apenas números inteiros.");
        } 
    }
}