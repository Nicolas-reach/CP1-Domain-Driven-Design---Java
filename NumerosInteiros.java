import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int inicio = Math.min(num1, num2);
        int fim = Math.max(num1, num2);

        System.out.println("Números inteiros entre " + num1 + " e " + num2 + ":");
        for (int n = inicio + 1; n < fim; n++) {
            System.out.println(n);
        }

        scanner.close();
    }
}