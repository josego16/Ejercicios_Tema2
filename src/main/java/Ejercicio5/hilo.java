package Ejercicio5;

public class hilo extends Thread {
    private final cuentaBancaria c1;
    private final cuentaBancaria c2;

    public hilo(String nombre, cuentaBancaria c1, cuentaBancaria c2) {
        super(nombre);
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (c1.getNumCuenta().compareTo(c2.getNumCuenta()) < 0) {
                synchronized (c1) {
                    c1.sacarCantidad(10);
                    synchronized (c2) {
                        transferencia.transferCuenta(c1, c2, 10);
                        c2.ingresarCantidad(10);
                    }
                }
            } else {
                synchronized (c2) {
                    c2.sacarCantidad(10);
                    synchronized (c1) {
                        transferencia.transferCuenta(c1, c2, 10);
                        c1.ingresarCantidad(10);
                    }
                }
            }
        }
    }
}