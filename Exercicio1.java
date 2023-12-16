import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = 0;

        System.out.println("Digite um inteiro maior que zero:");

        while (true) {
            while (!input.hasNextInt()) {
                System.out.println("Entrada inválida! Por favor, insira um número inteiro:");
                input.next();
            }

            X = input.nextInt();

            if (X > 0) {
                break;
            }

            System.out.println("Número inválido! O número tem que ser um inteiro maior do que zero!");
            System.out.println("Digite novamente:");
        }

        if (X % 2 != 0) {
            System.out.println("Weird");
        } else if (X <= 5) {
            System.out.println("Not Weird");
        } else if (X <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        input.close();
    }
}