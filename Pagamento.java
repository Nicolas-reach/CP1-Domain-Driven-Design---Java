import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço do produto: R$ ");
        double preco = sc.nextDouble();

        System.out.println("Forma de pagamento:");
        System.out.println("1 - À vista (10% de desconto)");
        System.out.println("2 - Parcelado em 2x (sem juros)");
        System.out.println("3 - Parcelado em 4x (8% de juros)");
        System.out.print("Opção: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1 -> {
                double total = preco * 0.90;
                System.out.printf("Total à vista: R$ %.2f%n", total);
            }
            case 2 -> {
                System.out.printf("Total: R$ %.2f (2x de R$ %.2f)%n", preco, preco / 2);
            }
            case 3 -> {
                double total = preco * 1.08;
                System.out.printf("Total: R$ %.2f (4x de R$ %.2f)%n", total, total / 4);
            }
            default -> System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
