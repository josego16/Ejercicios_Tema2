package Ejercicio6;

import java.util.Random;

public class simulacionPuente {
    public static void main(String[] args) {
        puente puente = new puente(3, 5000);
        Random random = new Random();

        System.out.println("-------------------------------------");
        System.out.println("Diseñado por Jose maria Gomez liñan");
        System.out.println("-------------------------------------");

        for (int i = 0; i < 10; i++) {
            int peso = random.nextInt(2000 - 800 + 1) + 1000;
            int tiempoLlegada = random.nextInt(6000 - 1000 + 1) + 1000;
            int tiempoPaso = random.nextInt(15000 - 10000 + 1) + 10000;


            coche coche = new coche(peso, tiempoLlegada, tiempoPaso, puente);
            coche.start();
        }
    }
}
