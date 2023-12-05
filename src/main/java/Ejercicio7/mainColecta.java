package Ejercicio7;

public class mainColecta {
    public static void main(String[] args) {
        colecta colecta = new colecta();

        hilos hilo1 = new hilos(colecta, "Hilo 1");
        hilos hilo2 = new hilos(colecta, "Hilo 2");
        hilos hilo3 = new hilos(colecta, "Hilo 3");
        hilos hilo4 = new hilos(colecta, "Hilo 4");
        hilos hilo5 = new hilos(colecta, "Hilo 5");

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
    }
}
