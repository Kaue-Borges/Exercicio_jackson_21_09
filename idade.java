import java.util.Scanner;

public class idade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Digite a sua idade: ");
            int idade = sc.nextInt();

            if (idade < 18) {
                System.out.println("Você é de menor");
            }
            if (idade >= 18 && idade < 60) {
                System.out.println("Você é dee maior");
            }
            if (idade >= 60) {
                System.out.println("Você é velho pra caralho");
            }

            sc.close();
        } catch (ArithmeticException e) {
            System.out.println("Erro");
        } catch (Exception e) {
            System.out.println("Erro, Digita apenas idade completa burrão");
        } 
    }
}