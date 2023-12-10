package Ejercicio5;

public class TransferenciaConBloqueo {
    public static void main(String[] args) {
        cuentaBancaria c1, c2;
        c1 = new cuentaBancaria(20500, "ES92233223323244563");
        c2 = new cuentaBancaria(50000, "ES21599598685884858");

        hilo h1, h2;
        h1 = new hilo(c1, c2);
        h1.setName("Jose Maria");
        h1.start();

        h2 = new hilo(c2, c1);
        h2.setName("Jaime");
        h2.start();

        try {
            h1.join();
            h2.join();

            System.out.println("Todas las transacciones han finalizado\n");
            System.out.println(c1);
            System.out.println(c2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}