package primeiroexercicio;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuComSwitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try{ 
        int opcao = 0;
        while (opcao != 4) {
        System.out.println("===== MENU =====");
        System.out.println("1 - Calcular área de um quadrado");
        System.out.println("2 - Calcular área de um círculo");
        System.out.println("3 - Calcular perímetro de um retângulo");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");

        opcao = entrada.nextInt();

        switch (opcao) {
            case 1 : System.out.println( "Voce escolheu quadrado: ");
            System.out.print("Digite o lado do quadrado: ");
            double lado = entrada.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.println("Área do quadrado: " + areaQuadrado);
            break;
            case 2 : System.out.println( "voce escolehu o circulo: ");
            System.out.println("Digite o raio do circulo");
            double raio = entrada.nextDouble();
            double areaCirculo = Math.PI * raio * raio;
            System.out.println("Área do círculo: " + areaCirculo);
            break;
            case 3 : System.out.println( "voce escolheu calcular o perimetro de um retangulo: ");
            System.out.println("Digite a area de um retangulo: ");
            double base = entrada.nextDouble();
            System.out.println("Digite a altura de um retangulo:");
            double altura = entrada.nextDouble();
            double perimetro = 2 * (base + altura);
            System.out.println("O perimetro do retangulo é: " + perimetro);
            break;
            case 4 : System.out.println( "voce escoleu sair: ");
            System.out.println("tchauuuuuuuu.");
            break;
        }        
    }
        }catch (InputMismatchException e) {
            System.out.println("Erro: digite apenas números.");

        } finally {

            entrada.close();
        }
}
}
