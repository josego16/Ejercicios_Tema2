package Ejercicio6;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class coche extends Thread {
    private int peso;
    private int tiempoLlegada;
    private int tiempoPaso;
    private puente puente;

    @Override
    public void run() {
        try {
            Thread.sleep(tiempoLlegada);
            if (puente.sePermitePaso(peso)) {
                System.out.printf("El coche con peso %d ha pasado por el puente\n", peso);
                Thread.sleep(tiempoPaso);
                System.out.printf("El coche con peso %d ha salido del puente\n", peso);
                puente.finalizarPaso(peso);
            } else {
                System.out.printf("El coche %d no puede pasar por el puente en estos momentos\n", peso);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}