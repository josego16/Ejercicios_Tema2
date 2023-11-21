package Ejercicio5;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class cuentaBancaria {
    private String numCuenta;
    private int saldo;

    public synchronized double ingresarCantidad(double cantidad) {
        return cantidad;
    }

    public synchronized double sacarCantidad(double cantidad) {
        return cantidad;
    }

    public synchronized double getNumeroCuenta(double cuenta) {
        return cuenta;
    }
}
