package org.iesfm.banco;

import java.util.Arrays;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private Cuenta[] cuentas;

    public Cliente(String nombre, String apellidos, String dni, Cuenta[] cuentas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.cuentas = cuentas;
    }


    public void printInfo() {
        System.out.println(nombre + " " + apellidos + " con DNI " + dni);

    }

    public void printCuentas() {
        for (int i = 0; i < cuentas.length; i++) {
            Cuenta cuenta = cuentas[i];
            cuenta.infoCuenta();
        }

    }

    //Forma mikel para el punto 3//
    public void ImprimeCuentasCliente(String cuenta) {
        Cuenta c = findCuenta(cuenta);
        if (cuenta != null) {
            c.info();
        } else {
            System.out.println("no existe la cuenta");
        }
    }

    public Cuenta findCuenta(String numeroCuenta) {
        Cuenta resultado = null;
        for (Cuenta c : cuentas) {
            if (c.getCuenta().equals(numeroCuenta)) {
                resultado = c;
            }
        }
        return resultado;
    }

    public void ingresar(String cuenta, double ingreso) {
        Cuenta c = findCuenta(cuenta);
        if (c != null) {
            c.ingresar(ingreso);
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }

    public void retirar(String cuenta, double dinero) {
        Cuenta c = findCuenta(cuenta);
        if (c != null) {
            c.retirar(dinero);
        } else {
            System.out.println("Cuenta no encontrada");
        }
    }

    public void traspasoCuentas(String numeroCuentaOrigen, String numeroCuentaDestino, double dinero) {
        Cuenta cuentaOrigen = findCuenta(numeroCuentaOrigen);
        Cuenta cuentaDestino = findCuenta(numeroCuentaDestino);
        if (cuentaOrigen != null && cuentaDestino != null) {
            if (cuentaOrigen.comprobarSaldo(dinero)) {
                cuentaOrigen.retirar(dinero);
                cuentaDestino.ingresar(dinero);
            }
        } else {
            System.out.println("operacion invalida, una o varias cuentas no existe");
        }
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) &&
                Objects.equals(apellidos, cliente.apellidos) &&
                Objects.equals(dni, cliente.dni) &&
                Arrays.equals(cuentas, cliente.cuentas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nombre, apellidos, dni);
        result = 31 * result + Arrays.hashCode(cuentas);
        return result;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", cuentas=" + Arrays.toString(cuentas) +
                '}';
    }


}

