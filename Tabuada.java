public class Tabuada {

    public static void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        mostrarTabuada(7); // exemplo de uso
    }
}