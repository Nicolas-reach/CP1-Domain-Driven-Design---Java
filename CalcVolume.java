import java.util.Scanner;

public class CalcVolume {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da caixa: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o comprimento da caixa: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura da caixa: ");
        double largura = scanner.nextDouble();

        double volume = altura * comprimento * largura;

        System.out.println("O volume da caixa é: " + volume);

        scanner.close();
    }
}