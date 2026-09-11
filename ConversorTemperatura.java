import java.util.Scanner;

public class ConversorTemperatura {

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = fahrenheitParaCelsius(fahrenheit);

        System.out.println("Temperatura em Celsius: " + celsius + " °C");

        scanner.close();
    }
}