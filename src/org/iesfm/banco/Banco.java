package org.iesfm.banco;

import java.util.Arrays;
import java.util.Objects;


public class Banco implements IBanco {
    private String nombre;
    private Cliente[] clientes;

    public Banco(String nombre, Cliente[] clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
    }

    @Override
    public void infoClientes() {
        for (int i = 0; i < clientes.length; i++) {
            Cliente cliente = clientes[i];
            cliente.printInfo();
        }
    }

    //Forma mikel para 3 ejercicio//

    private Cliente findCliente(String dni) {
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getDni().equals(dni)) {
                cliente = c;
            }
        }
        return cliente;
    }


    public void printCuentasDeClientes(String dni, String cuenta) {
        Cliente cliente = findCliente(dni);
        if (cliente != null) {
            cliente.ImprimeCuentasCliente(cuenta);
        } else {
            System.out.println("Cliente no encontrado");
        }
    }

    @Override
    public void infoCuentas(String dni) {
        boolean encontrado = false;
        for (int i = 0; i < clientes.length; i++) {
            Cliente cliente = clientes[i];
            if (cliente.getDni().equals(dni)) {
                encontrado = true;
                cliente.printCuentas();
            }
        }
        if (!encontrado) {
            System.out.println("El cliente no existe o ha introducido mal el dni");
        }
    }

    @Override
    public void ingresaDinero(String dni, String cuenta, double dinero) {
        Cliente cliente = findCliente(dni);
        if (cliente != null) {
            cliente.ingresar(cuenta, dinero);
        } else {
            System.out.println("No se puede ingresar el dinero, cliente no encontrado");
        }

    }

    @Override
    public void retirarDinero(String dni, String cuenta, double dinero) {
        Cliente cliente = findCliente(dni);
        if (cliente != null) {
            cliente.retirar(cuenta, dinero);
        } else {
            System.out.println("No se puede retirar el dinero, cliente no encontrado");
        }
    }

    @Override
    public void traspasoCuentas(String dni, String cuentaOrigen, String cuentaDestino, double dinero) {
        Cliente cliente = findCliente(dni);
        if (cliente != null) {
            cliente.traspasoCuentas(cuentaOrigen, cuentaDestino, dinero);
        } else {
            System.out.println("cliente no encontrado");
        }
    }

    @Override
    public void transferenciaCuentas(String dniOrigen, String dniDestino, String numeroCuentaOrigen, String numeroCuentaDestino, double dinero) {
        Cliente clienteOrigen = findCliente(dniOrigen);
        Cliente clienteDestino = findCliente(dniDestino);
        if (clienteOrigen != null && clienteDestino != null) {
            Cuenta cuentaOrigen = clienteOrigen.findCuenta(numeroCuentaOrigen);
            Cuenta cuentaDestino = clienteOrigen.findCuenta(numeroCuentaDestino);
            if (cuentaOrigen != null && cuentaDestino != null) {
                if (dinero <= cuentaOrigen.getSaldo()) {
                    cuentaOrigen.retirar(dinero);
                    cuentaDestino.ingresar(dinero);
                } else {
                    System.out.println("no hay suficiente saldo en la cuenta");
                }
            }
        } else {
            System.out.println("Operación invalida, una de las cuentas o ambas no existen");
        }
    }


    public void printClienteCuenta(String numeroCuenta) {

        for (Cliente cliente : clientes) {
            Cuenta cuenta = cliente.findCuenta(numeroCuenta);
            if (cuenta != null) {
                cliente.printInfo();
            }
        }
    }

    public Cuenta findCuenta(String numeroCuenta) {
        Cuenta result = null;
        for (Cliente cliente : clientes) {
            Cuenta cuenta = cliente.findCuenta(numeroCuenta);
            if (cuenta != null) {
                result = cuenta;
            }

        }
        return result;
    }


    public void transferenciaCuentasSinDNI(String numeroCuentaOrigen, String numeroCuentaDestino, double dinero) {
        Cuenta cuentaOrigen = findCuenta(numeroCuentaOrigen);
        Cuenta cuentaDestino = findCuenta(numeroCuentaDestino);
        if (cuentaOrigen != null && cuentaDestino != null) {
            if (cuentaOrigen.comprobarSaldo(dinero)) {
                cuentaOrigen.retirar(dinero);
                cuentaDestino.ingresar(dinero);
            } else {
                System.out.println("No hay saldo suficiente en la cuenta origen.");
            }
        } else {
            System.out.println("no se encontro la cuenta");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banco banco = (Banco) o;
        return Objects.equals(nombre, banco.nombre) &&
                Arrays.equals(clientes, banco.clientes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre);
        result = 31 * result + Arrays.hashCode(clientes);
        return result;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", clientes=" + Arrays.toString(clientes) +
                '}';
    }
}
