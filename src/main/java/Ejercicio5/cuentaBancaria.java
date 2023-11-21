package Ejercicio5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class cuentaBancaria {
    private String numCuenta;
    private int saldo;

    public synchronized double ingresarCantidad(double cantidad) {
        return saldo += (int) cantidad;
    }

    public synchronized double sacarCantidad(double cantidad) {
        return saldo -= (int) cantidad;
    }

    public String getNumeroCuenta() {
        return numCuenta;
    }
}


