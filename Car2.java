public class Car2 {

    public static void main(String[] args) {

        Car carro1 = new Car("Toyota", "Corolla", 2024);
        Car carro2 = new Car("Honda", "Civic", 2023);

        System.out.println("Carro 1:");
        carro1.exibirInformacoes();

        System.out.println();

        System.out.println("Carro 2:");
        carro2.exibirInformacoes();
    }
}