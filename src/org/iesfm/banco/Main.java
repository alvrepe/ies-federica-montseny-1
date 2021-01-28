package org.iesfm.banco;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);


    private static Banco pideBanco() {
        System.out.println("Introduce el nombre del banco");
        String nombre = scan.nextLine();
        return new Banco(nombre, pideClientes());
    }

    private static Cliente[] pideClientes() {
        System.out.println("Introduce el numero de clientes");
        int cantidad = scan.nextInt();
        scan.nextLine();
        while (cantidad <= 0) {
            System.out.println("Tiene que tener un cliente como mínimo");
            cantidad = scan.nextInt();
            scan.nextLine();
        }
        Cliente[] arrayCliente = new Cliente[cantidad];
        for (int i = 0; i < arrayCliente.length; i++) {
            arrayCliente[i] = pideCliente();
        }
        return arrayCliente;
    }

    private static void menu(String banco) {
        System.out.println("-----Bienvenido a " + banco + "-----");
        System.out.println("1.Monstrar nombre, apellidos y NIF de todos los clientes.");
        System.out.println("2.Mostrar información de las cuentas de un cliente.");
        System.out.println("3.Monstrar la información de la cuenta de un cliente.");
        System.out.println("4.Ingresar dinero en una cuenta de un cliente.");
        System.out.println("5.sacar dinero en una cuenta de un cliente.");
        System.out.println("6.Haz una traspaso entre cuentas");
        System.out.println("7.Transferencia entre cuentas.");
        System.out.println("8.imprime cuentas con numero de cuenta.");
        System.out.println("9.Transferencia cuentas sin numero de cuentas.");
        System.out.println("10.Salir.");
    }

    private static Cliente pideCliente() {
        System.out.println("Introduce el nombre del cliente");
        String nombre = scan.nextLine();
        System.out.println("Introduce el apellido del cliente");
        String apellidos = scan.nextLine();
        System.out.println("Introduce el DNI del cliente:");
        String dni = scan.nextLine();
        return new Cliente(nombre, apellidos, dni, pideCuentas());
    }

    private static Cuenta pideCuenta() {
        System.out.println("Introduce el número de la cuenta :");
        String numero = scan.nextLine();
        System.out.println("Introduce saldo de la cuenta:");
        int saldo = scan.nextInt();
        scan.nextLine();
        return new Cuenta(numero, saldo);
    }

    private static Cuenta[] pideCuentas() {
        System.out.println("Introduce el numero de las cuentas que tiene a su disposición:");
        int cantidad = scan.nextInt();
        scan.nextLine();
        while (cantidad <= 0) {
            System.out.println("Tiene que tener minimo una cuenta");
            cantidad = scan.nextInt();
            scan.nextLine();
        }
        Cuenta[] arrayCuenta = new Cuenta[cantidad];
        for (int i = 0; i < arrayCuenta.length; i++) {
            arrayCuenta[i] = pideCuenta();
        }
        return arrayCuenta;
    }

    private static int operacion(String banco) {
        menu(banco);
        int op = scan.nextInt();
        scan.nextLine();
        while (op < 1 || op > 10) {
            System.out.println("Operación inválida");
            menu(banco);
            op = scan.nextInt();
            scan.nextLine();
        }
        return op;
    }

    private static void op1(Banco banco) {
        banco.infoClientes();
    }

    private static void op2(Banco banco) {
        System.out.println("introduce el dni del cliente");
        String dni = scan.nextLine();
        banco.infoCuentas(dni);
    }

    private static void op3(Banco banco) {
        System.out.println("introduce el dni del cliente");
        String dni = scan.nextLine();
        System.out.println("introduce el Iban de la cuenta");
        String cuenta = scan.nextLine();
        banco.printCuentasDeClientes(dni, cuenta);
    }

    private static void op4(Banco banco) {
        System.out.println("introduce el dni del cliente");
        String dni = scan.nextLine();
        System.out.println("introduce el Iban de la cuenta");
        String cuenta = scan.nextLine();
        System.out.println("Introduce el importe que desee ingresar:");
        int saldo = scan.nextInt();
        scan.nextLine();
        banco.ingresaDinero(dni, cuenta, saldo);

    }

    private static void op5(Banco banco) {
        System.out.println("introduce el dni del cliente");
        String dni = scan.nextLine();
        System.out.println("introduce el Iban de la cuenta");
        String cuenta = scan.nextLine();
        System.out.println("Introduce el importe que desee retirar:");
        int saldo = scan.nextInt();
        scan.nextLine();
        banco.retirarDinero(dni, cuenta, saldo);

    }

    private static void op6(Banco banco) {
        System.out.println("introduce el dni del cliente");
        String dni = scan.nextLine();
        System.out.println("introduce el Iban de la cuenta de Origen");
        String cuentaOrigen = scan.nextLine();
        System.out.println("introduce el Iban de la cuenta de Destino");
        String cuentaDestino = scan.nextLine();
        System.out.println("Introduce el importe que desee ingresar:");
        int saldo = scan.nextInt();
        scan.nextLine();
        banco.traspasoCuentas(dni, cuentaOrigen, cuentaDestino, saldo);

    }

    private static void op7(Banco banco) {
        System.out.println("introduce el dni del cliente");
        String dniOrigen = scan.nextLine();
        System.out.println("introduce el dni del segundo cliente");
        String dniDestino = scan.nextLine();
        System.out.println("introduce el Iban de la cuenta de Origen");
        String cuentaOrigen = scan.nextLine();
        System.out.println("introduce el Iban de la cuenta de Destino");
        String cuentaDestino = scan.nextLine();
        System.out.println("Introduce el importe que desee ingresar:");
        int saldo = scan.nextInt();
        scan.nextLine();
        banco.transferenciaCuentas(dniOrigen, dniDestino, cuentaOrigen, cuentaDestino, saldo);
    }

    private static void op8(Banco banco) {

        System.out.println("introduce el Iban de la cuenta");
        String cuenta = scan.nextLine();
        banco.printClienteCuenta(cuenta);
    }

    private static void op9(Banco banco) {
        System.out.println("introduce el Iban de la cuenta de Origen");
        String cuentaOrigen = scan.nextLine();
        System.out.println("introduce el Iban de la cuenta de Destino");
        String cuentaDestino = scan.nextLine();
        System.out.println("Introduce el importe que desee ingresar:");
        int saldo = scan.nextInt();
        scan.nextLine();
        banco.transferenciaCuentasSinDNI(cuentaOrigen, cuentaDestino, saldo);
    }


    public static void main(String[] args) {
        Banco banco = pideBanco();


        int op = operacion(banco.getNombre());

        while (op != 10) {
            if (op == 1) {
                op1(banco);
            } else if (op == 2) {
                op2(banco);
            } else if (op == 3) {
                op3(banco);
            } else if (op == 4) {
                op4(banco);
            } else if (op == 5) {
                op5(banco);
            } else if (op == 6) {
                op6(banco);
            } else if (op == 7) {
                op7(banco);
            } else if (op == 8) {
                op8(banco);
            } else if (op == 9) {
                op7(banco);
            }
            op = operacion(banco.getNombre());


        }
        System.out.println("gracias por usar la aplicacion");


    }


}
