package Ejercicio5;

public class hilo extends Thread {
    private final cuentaBancaria c1;
    private final cuentaBancaria c2;
    private final String nombre;

    public hilo(String nombre, cuentaBancaria c1, cuentaBancaria c2) {
        super(nombre);
        this.nombre = nombre;
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            boolean transfer = transferencia.transferCuenta(c1, c2, 10);
            if (!transfer) {
                System.out.println("Hilo " + nombre + " intento realizar la transferencia " + i + " y no pudo");
            }
        }
    }
}