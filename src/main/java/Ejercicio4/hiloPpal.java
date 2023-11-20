package Ejercicio4;

import lombok.AllArgsConstructor;

import java.util.Random;

@AllArgsConstructor
class hiloPpal extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int num = random.nextInt(101);
            int resultado = numeroOculto.proponerNumero(num);

            if (resultado == 1) {
                System.out.printf("El hilo ha adivinado el numero %s\n", num);
                break;
            } else if (resultado == -1) {
                System.out.printf("El juego ha terminado, otro hilo ha adivinado un numero diferente %s\n", num);
                break;
            }
        }
    }
}
