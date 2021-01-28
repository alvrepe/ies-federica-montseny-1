package org.iesfm.banco;

public interface IBanco {
    void infoClientes();

    void infoCuentas(String dni);

    void printCuentasDeClientes(String dni, String cuenta);

    void ingresaDinero(String dni, String cuenta, double dinero);

    void retirarDinero(String dni, String cuenta, double dinero);

    void traspasoCuentas(String dni, String cuentaOrigen, String cuentaDestino, double dinero);

    void transferenciaCuentas(String dniOrigen, String dniDestino, String cuentaOrigen, String cuentaDestino, double dinero);

    void printClienteCuenta(String numeroCuenta);

    void transferenciaCuentasSinDNI(String cuentaOrigen, String cuentaDestino, double dinero);
}
