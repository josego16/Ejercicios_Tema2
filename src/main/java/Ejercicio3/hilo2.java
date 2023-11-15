package Ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Random;

@Data
@AllArgsConstructor
public class hilo2 implements Runnable {
    private String nombre;

    @Override
    public void run() {
        System.out.printf("Hola soy de la clase hilo2 %s\n", this.nombre);
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int pausa = 10 + random.nextInt(491 - 10);
            try {
                Thread.sleep(pausa);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
