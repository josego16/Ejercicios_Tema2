package Ejercicio7;

public class mainColecta {
    public static void main(String[] args) {
        colecta colecta = new colecta();

        System.out.println("--- Huerta de Jose Maria ---");
        System.out.println("Inicio de la recolecta");
        System.out.println("----------------------------\n");
        for (int i = 1; i <= 4; i++) {
            hilos hilo = new hilos(colecta, "Hilo " + i);
            hilo.start();
        }
    }
}