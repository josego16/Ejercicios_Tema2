package Ejercicio5;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class transferencia {
    private cuentaBancaria c1;
    private cuentaBancaria c2;

    public synchronized static void transferCuenta(cuentaBancaria c1, cuentaBancaria c2, int cantidad) {
        new cuentaBancaria("ES388388433883838388484", 30000);
        new cuentaBancaria("ES99090499388484889399", 60000);
        if (c1.getSaldo() >= cantidad) {
            c1.sacarCantidad(cantidad);
            c2.sacarCantidad(cantidad);
            c1.ingresarCantidad(cantidad);
            c2.ingresarCantidad(cantidad);
        }
    }
}
