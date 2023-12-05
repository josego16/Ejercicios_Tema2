package Ejercicio7;

import java.util.Random;

public class colecta {
    private int cantidadRecogida;

    public synchronized void recolectar(String nombre) {
        Random random = new Random();
        int cantidad = random.nextInt(25 - 4 + 1) + 4;

        if (cantidadRecogida + cantidad > 2000) {
            cantidad = 2000 - cantidadRecogida;
        }
        cantidadRecogida += cantidad;

        System.out.printf("%s ha recolectado %d unidades\n", nombre, cantidad);
        System.out.printf("Cantidad total recolectada: %d\n", cantidadRecogida);

        if (cantidadRecogida >= 2000) {
            System.out.println("Se ha alcanzado la cantidad maxima\n!Fin del dia¡");
            System.exit(0);
        }
    }
}
