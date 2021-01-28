import java.util.Scanner;

public class Main_Vehiculo {

    static Scanner scan = new Scanner(System.in);

    static Vehiculo[] arrayVehiculos() {
        System.out.println("Introduce el numero de vehiculos a meter...:");
        int cantidad = scan.nextInt();
        while (cantidad <= 0) {
            System.out.println("tiene que haber al menos un vehiculo");
            cantidad = scan.nextInt();
        }
        Vehiculo[] vehiculosArray = new Vehiculo[cantidad];
        for (int i = 0; i < vehiculosArray.length; i++) {
            vehiculosArray[i] = pideVehiculo();
        }
        return vehiculosArray;
    }

    static Vehiculo pideVehiculo() {
        System.out.println("introduce un vehiculo");
        String tipo = scan.next();
        System.out.println("Cual sera la velocidad maxima");
        int velocidadMax = scan.nextInt();
        System.out.println("Cual sera el color");
        String color = scan.next();
        System.out.println("Cual sera la matricula");
        String matricula = scan.next();

        Vehiculo vehiculo = new Vehiculo(tipo, velocidadMax, color, matricula);
        return vehiculo;

    }


    public static void main(String[] args) {
        Vehiculo[] vehiculos = arrayVehiculos();
        System.out.println("Las matriculas de los vehiculos introducidos son..:");
        for (int i = 0; i < vehiculos.length; i++) {
            Vehiculo ejemplar = vehiculos[i];
            System.out.println(ejemplar.getMatricula());
        }
    }
}
