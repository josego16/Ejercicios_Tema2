package Ejercicio2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ejercicio2 extends Thread {
    private String palabra;

    public static void main(String[] args) {
        Thread hilo1 = new ejercicio2("\nJose maria");
        Thread hilo2 = new ejercicio2("\nJaime");

        hilo1.setPriority(Thread.MAX_PRIORITY);
        hilo2.setPriority(Thread.MIN_PRIORITY);

        hilo1.start();
        hilo2.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(palabra);
            System.out.flush();
        }
    }
}
