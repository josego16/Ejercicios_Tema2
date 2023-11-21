package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        cuentaBancaria c1 = new cuentaBancaria("ES388388433883838388484", 20500);
        cuentaBancaria c2 = new cuentaBancaria("ES99090499388484889399", 50000);

        System.out.println("****----****----****----****----****----****----****----****");
        System.out.println("(-- Este Ejercicio esta creado por Jose Maria Gomez Liñan --)");
        System.out.println("****----****----****----****----****----****----****----****\n");
        System.out.printf("La cuenta 1 tiene un total de %d euros.\n", c1.getSaldo());
        System.out.printf("La cuenta 2 tiene un total de %d euros.\n", c2.getSaldo());

        Thread h1 = new Thread(new hilo("Gomez Jose Maria", c1, c2));
        Thread h2 = new Thread(new hilo("Jaime Gomez", c1, c2));

        h1.start();
        h2.start();
        try {
            h1.join();
            h2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.printf("\nSaldo final de la cuenta 1: %d$\n", c1.getSaldo());
        System.out.printf("Saldo final de la cuenta 2: %d$\n", c2.getSaldo());
    }
}