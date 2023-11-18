package EjTeoria.LanzaYespera;

import lombok.AllArgsConstructor;

import java.util.Random;

@AllArgsConstructor
public class hijo implements Runnable {
    private String nombre;

    @Override
    public void run() {
        System.out.printf("Hola soy el hilo %s\n", this.nombre);
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int pausa = 10 + random.nextInt(491 - 10);
            System.out.printf("Hilo %s, hace una pausa de %d milisegundos\n", this.nombre, pausa);
            try {
                Thread.sleep(pausa);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.printf("Hilo %s terminado \n", this.nombre);
    }
}
