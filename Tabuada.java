import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
 
        try {
 
            System.out.print("Digite o número que voce deseja a tabuada: ");
            int numero = entrada.nextInt();
            
            for(int i = 1; i <=10; i++)
            System.out.println((numero) + " x " + (i) + " = " + (numero * i));
            
            entrada.close();
        }  catch (InputMismatchException e) {
 
            System.out.println("Erro: digite apenas números inteiros.");
 
        }
    }
}
