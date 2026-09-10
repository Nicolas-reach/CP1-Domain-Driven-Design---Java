import java.util.Scanner;

public class Media {

    public static double media(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Segundo número: ");
        double n2 = sc.nextDouble();
        System.out.print("Terceiro número: ");
        double n3 = sc.nextDouble();

        System.out.printf("Média: %.2f%n", media(n1, n2, n3));

        sc.close();
    }
}
