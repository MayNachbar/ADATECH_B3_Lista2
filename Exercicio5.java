import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número inteiro positivo para calcular o seu fatorial:");
        int numInserido = input.nextInt();
        long fatorial = 1L;
        for (int i = 1; i <= numInserido; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial do número inserido é: " + numInserido+ "! = " + fatorial);

        input.close();
    }
}