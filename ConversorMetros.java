import java.util.Scanner;

public class ConversorMetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println(metros + " m = " + centimetros + " cm");
        System.out.println(metros + " m = " + milimetros + " mm");

        scanner.close();
    }
}