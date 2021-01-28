package org.iesfm.banco;

import java.util.Objects;

public class Cuenta {
    private String cuenta;
    private double saldo;

    public Cuenta(String cuenta, int saldo) {
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public void infoCuenta() {
        System.out.println("la cuenta " + cuenta + " tiene " + saldo + " euros.");
    }

    public void info() {
        System.out.println(" la cuenta " + cuenta + " tiene " + saldo + " euros.");
    }


    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void infoCuentas() {
        System.out.println("La cuenta " + cuenta + " tiene " + saldo + " euros.");
    }

    public void ingresar(double ingreso) {
        saldo = saldo + ingreso;
    }

    public void retirar(double dinero) {
        if (saldo >= dinero) {
            saldo = saldo + dinero;
        } else {
            System.out.println("No hay suficiente dinero en la cuenta para retirar. saldo actual " + saldo);
        }
    }

    public boolean comprobarSaldo(double dinero) {
        if (dinero > saldo) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return this.cuenta == cuenta.cuenta &&
                saldo == cuenta.saldo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuenta, saldo);
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "cuenta=" + cuenta +
                ", saldo=" + saldo +
                '}';
    }

}
