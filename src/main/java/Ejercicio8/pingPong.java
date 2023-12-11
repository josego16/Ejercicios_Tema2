package Ejercicio8;

import java.util.Random;

public class pingPong {
    private static final int MAX_SCORE = 10;
    private static int santiScore = 0;
    private static int gabrielScore = 0;
    private static boolean winnerDeclared = false;

    public static void main(String[] args) {
        Thread santiThread = new Thread(() -> play("Santi"));
        Thread gabrielThread = new Thread(() -> play("Gabriel"));

        System.out.println("---------------------------------");
        System.out.println("Partido organizado por Jose Maria");
        System.out.println("---------------------------------");

        santiThread.start();
        gabrielThread.start();

        try {
            santiThread.join();
            gabrielThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (pingPong.class) {
            if (santiScore > gabrielScore) {
                System.out.println("¡Santi ha ganado!");
            } else if (gabrielScore > santiScore) {
                System.out.println("¡Gabriel ha ganado!");
            } else {
                System.out.println("¡La partida ha terminado en empate!");
            }
        }
    }

    private static void play(String playerName) {
        Random random = new Random();

        while (true) {
            try {
                Thread.sleep(random.nextInt(1000)); // Simula un tiempo de espera aleatorio entre golpe y golpe
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (pingPong.class) {
                if (santiScore >= MAX_SCORE || gabrielScore >= MAX_SCORE) {
                    break;  // Salir del bucle si un jugador ha ganado
                }

                int randomNumber = random.nextInt(10) + 1;
                boolean isEven = randomNumber % 2 == 0;

                System.out.println(playerName + " ha dado un golpe.");

                if ((playerName.equals("Santi") && isEven) || (playerName.equals("Gabriel") && !isEven)) {
                    System.out.println(playerName + " gana el punto.");
                    if (playerName.equals("Santi")) {
                        santiScore++;
                    } else {
                        gabrielScore++;
                    }
                } else {
                    System.out.println(playerName + " pierde el punto.");
                }

                System.out.println("Puntuación actual: " + santiScore + " - " + gabrielScore);
                System.out.println();
            }
        }

        // Evitar imprimir la sentencia de ganador más de una vez
        synchronized (pingPong.class) {
            if (!winnerDeclared) {
                System.out.println(playerName + " ha terminado la partida. Puntuación final: " + santiScore + " - " + gabrielScore);
                winnerDeclared = true;
            }
        }
    }
}