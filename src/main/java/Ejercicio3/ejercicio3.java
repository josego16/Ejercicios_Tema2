package Ejercicio3;

import java.util.Random;

public class ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            boolean aleatoria = random.nextBoolean();
            Thread hilo;
            if (aleatoria) {
                hilo = new Thread(new hilo1("Josema"));
                hilo.start();
            } else {
                hilo = new Thread(new hilo2("Jaime"));
                hilo.start();
            }
        }
    }
}
