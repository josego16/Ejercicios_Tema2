package Ejercicio5;

public class gestorTransferencias {
    public static boolean transferencia(cuentaBancaria c1, cuentaBancaria c2, int cantidad) {
        cuentaBancaria cuentaOrdenMenor, cuentaOrdenMayor;

        if (c1.getNumeroCuenta().compareTo(c2.getNumeroCuenta()) < 0) {
            cuentaOrdenMenor = c1;
            cuentaOrdenMayor = c2;
        } else {
            cuentaOrdenMenor = c2;
            cuentaOrdenMayor = c1;
        }
        synchronized (cuentaOrdenMenor) {
            synchronized (cuentaOrdenMayor) {
                if (cuentaOrdenMenor.getSaldo() >= cantidad) {
                    cuentaOrdenMenor.sacarCantidad(cantidad);
                    cuentaOrdenMayor.ingresarCantidad(cantidad);
                    return true;
                }
                return false;  //no hay saldo suficiente en la cuenta Menor
            }
        }
    }
}
