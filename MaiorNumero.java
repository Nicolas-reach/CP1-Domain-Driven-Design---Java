public class MaiorNumero {

    public static int maior(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int resultado = maior(15, 8);
        System.out.println("O maior número é: " + resultado);
    }
}