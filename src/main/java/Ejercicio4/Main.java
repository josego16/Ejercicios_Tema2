package Ejercicio4;

public class Main {
    private static final int numero = 10;

    public static void main(String[] args) {

        for (int i = 0; i < numero; i++) {
            hiloPpal h1 = new hiloPpal();
            h1.start();
            try {
                h1.join();
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
