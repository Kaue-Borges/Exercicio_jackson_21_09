import java.util.Scanner;
 
public class Calculadora {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        try {
 
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();
 
            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();
 
            System.out.println("\nResultados:");
            System.out.println("Soma = " + (num1 + num2));
            System.out.println("Subtração = " + (num1 - num2));
            System.out.println("Multiplicação = " + (num1 * num2));
            System.out.println("Divisão = " + (num1 / num2));
            System.out.println("Módulo = " + (num1 % num2));
            
            sc.close();
        } catch (ArithmeticException e) {
 
            System.out.println("Erro: não é possível dividir por zero.");
 
        } catch (Exception e) {
 
            System.out.println("Erro: digite apenas números inteiros.");
 
        } 
    }
}