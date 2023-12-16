import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número inteiro:");
        int X = input.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = X * i;
            System.out.printf("%d x %d = %d\n", X, i, resultado);
        };

        input.close();
    }
}