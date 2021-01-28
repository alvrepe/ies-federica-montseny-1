import java.util.Scanner;


public class ScannerTienda {
    static Scanner scan = new Scanner(System.in);

    public static Telefono datosTelefono() {
        System.out.println("introduce el modelo del telefono");
        String modelo = scan.next();
        System.out.println("Introduce el precio del modelo");
        double precio = scan.nextDouble();
        System.out.println("introduce el stock de la tienda");
        int stock = scan.nextInt();
        Telefono telefono = new Telefono(modelo, stock, precio);
        return telefono;
    }

    public static Tienda datosTienda() {
        System.out.println("cuantos telefonos tiene la tienda");
        int cantidad = scan.nextInt();
        Telefono[] telefonos = new Telefono[cantidad];
        for (int i = 0; i < cantidad; i++) {
            telefonos[i] = datosTelefono();
        }
        Tienda tienda = new Tienda(telefonos);
        return tienda;
    }

    public static void main(String[] args) {
        Tienda tienda = datosTienda();
        while (true) {
            System.out.println("Que modelo deseas comprar...:");
            String modelo = scan.next();
            if (modelo.equals("salir")) {
                break;
            }
            tienda.hayTelefonos(modelo);
            System.out.println("cuantas unidades quieres quieres");
            int cantidad = scan.nextInt();
            tienda.pedido(modelo, cantidad);
        }
    }

}
