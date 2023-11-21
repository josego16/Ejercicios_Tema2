package Ejercicio5;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class transferencia {
    private cuentaBancaria c1;
    private cuentaBancaria c2;

    public synchronized static boolean transferCuenta(cuentaBancaria c1, cuentaBancaria c2, int cantidad) {
        synchronized (c1) {
            if (c1.getSaldo() >= cantidad) {
                c1.sacarCantidad(cantidad);
                synchronized (c2) {
                    c2.ingresarCantidad(cantidad);
                }
                return true;
            } else {
                return false;
            }
        }
    }
}
