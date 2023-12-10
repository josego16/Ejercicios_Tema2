package Ejercicio5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class cuentaBancaria {
    private int saldo;
    private final String numeroCuenta;

    public synchronized void sacarCantidad(int cantidad) {
        this.saldo -= cantidad;
    }

    public synchronized void ingresarCantidad(int cantidad) {
        this.saldo += cantidad;
    }
}


