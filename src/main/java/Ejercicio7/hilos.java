package Ejercicio7;

import java.util.Random;

public class hilos extends Thread {
    private final colecta colecta;
    private final String nombre;

    public hilos(colecta colecta, String nombre) {
        this.colecta = colecta;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (true) {
            colecta.recolectar(nombre);
            try {
                Thread.sleep(new Random().nextInt(2000) + 500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
