import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media = 0;
        double somaDasNotas = 0;

        System.out.println("Quantas notas você quer calcular?");
        int quantidadeDeNotas = input.nextInt();
        double[] notas = new double[quantidadeDeNotas];

        for (int i = 0; i < notas.length; i++){
            System.out.printf("Insira a nota %d:\n", i+1);
            notas[i] = input.nextDouble();
            somaDasNotas = somaDasNotas + notas[i];
        };

        media = somaDasNotas / quantidadeDeNotas;

        System.out.printf("A média das notas inseridas é: %.2f", media);

        input.close();
    }
}