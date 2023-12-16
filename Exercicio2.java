import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int operacao;

        do {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Somar\n" +
                               "2 - Subtrair\n" +
                               "3 - Dividir\n" +
                               "4 - Multiplicar\n" +
                               "5 - Resto\n" +
                               "6 - Raiz\n" +
                               "7 - Potência\n" +
                               "8 - Sair"
            );
            operacao = input.nextInt();

            if (operacao >= 1 && operacao <= 7) {
                System.out.println("Insira um número:");
                double num1 = input.nextDouble();

                if (operacao == 3) {
                    double num2;
                    do {
                        System.out.println("Insira outro número (não pode ser zero):");
                        num2 = input.nextDouble();
                    } while (num2 == 0);
                    realizarOperacao(operacao, num1, num2);

                } else if (operacao == 6) {
                    realizarOperacao(operacao, num1, 0);
                } else {
                    System.out.println("Insira outro número:");
                    double num2 = input.nextDouble();
                    realizarOperacao(operacao, num1, num2);
                }

                System.out.println("Deseja realizar outra operação? (Digite 's' ou 'n')");
                String resposta = input.next().toLowerCase();
                if (!resposta.equals("s")) {
                    break;
                }

            } else if (operacao != 8) {
                System.out.println("Operação inválida!");
            }

        } while (operacao != 8);

        input.close();
    }

    public static void realizarOperacao(int operacao, double num1, double num2) {
        switch (operacao) {
            case 1:
                somar(num1, num2);
                break;
            case 2:
                subtrair(num1, num2);
                break;
            case 3:
                dividir(num1, num2);
                break;
            case 4:
                multiplicar(num1, num2);
                break;
            case 5:
                resto(num1, num2);
                break;
            case 6:
                raiz(num1);
                break;
            case 7:
                potencia(num1, num2);
                break;
        }
    }

    public static void somar(double num1, double num2) {
        double soma = num1 + num2;
        System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, soma);
    }

    public static void subtrair(double num1, double num2) {
        double subtracao = num1 - num2;
        System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, subtracao);
    }

    public static void dividir(double num1, double num2) {
        double divisao = num1 / num2;
        System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, divisao);
    }

    public static void multiplicar(double num1, double num2) {
        double multiplicacao = num1 * num2;
        System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, multiplicacao);
    }

    public static void resto(double num1, double num2) {
        double resto = num1 % num2;
        System.out.printf("Resto de %.2f dividido por %.2f = %.2f\n", num1, num2, resto);
    }

    public static void raiz(double num1) {
        double raiz = Math.sqrt(num1);
        System.out.printf("Raiz de %.2f = %.2f\n", num1, raiz);
    }

    public static void potencia(double num1, double num2) {
        double potencia = Math.pow(num1, num2);
        System.out.printf("%.2f ^ %.2f = %.2f\n", num1, num2, potencia);
    }
}