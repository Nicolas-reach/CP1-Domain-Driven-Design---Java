import java.util.Scanner;

public class MaisVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeMaisVelha = "";
        int maiorIdade = -1;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Nome da pessoa " + i + ": ");
            String nome = sc.nextLine();
            System.out.print("Idade de " + nome + ": ");
            int idade = sc.nextInt();
            sc.nextLine();

            if (idade > maiorIdade) {
                maiorIdade = idade;
                nomeMaisVelha = nome;
            }
        }

        System.out.println("A pessoa mais velha é " + nomeMaisVelha + ", com " + maiorIdade + " anos.");

        sc.close();
    }
}
