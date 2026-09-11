import java.util.Scanner;

public class Fatorial {

    public static long fatorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não definido para números negativos.");
        } else {
            System.out.println("O fatorial de " + numero + " é " + fatorial(numero));
        }

        scanner.close();
    }
}