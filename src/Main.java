import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criação dos veículos
        Vehicle mareaturbo1 = new Vehicle("Mobi", 2015, "Green", 20.5, 40.0, 120.5);
        Vehicle mareaturbo2 = new Vehicle("Celta", 2001, "Gray", 500, 15.0, 100);
        Vehicle mareaturbo3 = new Vehicle("Fusca", 1985, "Blue", 1000, 16.0, 80);

        // Demonstrando uso dos métodos
        mareaturbo1.accelerate(50);  // Acelerando o Mobi por 50 km
        mareaturbo2.accelerate();    // Acelerando o Celta por 10 km (uso da sobrecarga)
        mareaturbo3.brake(200);      // Freando o Fusca por 200 km

        // Verificando nível de combustível
        System.out.println(Vehicle.checkFuel(mareaturbo1.getFuel())); // Para o Mobi
        System.out.println(Vehicle.checkFuel(mareaturbo2.getFuel())); // Para o Celta
        System.out.println(Vehicle.checkFuel(mareaturbo3.getFuel())); // Para o Fusca

        // Exibindo detalhes dos veículos após as operações
        System.out.println(mareaturbo1);
        System.out.println(mareaturbo2);
        System.out.println(mareaturbo3);

        // Criando a lista de veículos
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(mareaturbo1);
        vehicles.add(mareaturbo2);
        vehicles.add(mareaturbo3);

        // Percorrendo a lista e exibindo os detalhes de cada veículo
        System.out.println("\nDetalhes dos veículos na lista:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
