package EjTeoria.LanzaYespera;

public class lanzaYespera {
    public static void main(String[] args) {
        Thread h1 = new Thread(new hijo("Jose maria"));
        Thread h2 = new Thread(new hijo("Jaime"));

        h1.start();
        h2.start();
        try {
            h1.join();
            h2.join();
        } catch (InterruptedException ex) {
            System.out.println("Hilo principal interrumpido " + ex.getMessage());
        }
        System.out.println("Hilo principal terminado");
    }
}
