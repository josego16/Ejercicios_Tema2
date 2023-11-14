package Ejercicio1;

public class ejercicio1 {
    public static void main(String[] args) {
        Thread actual = Thread.currentThread();

        System.out.print("\nInformacion del metodo actual:");
        System.out.printf("\nMi id es %d", actual.threadId());
        System.out.printf("\nMi nombre es %s", actual.getName());
        System.out.printf("\nMi estado actual es %s", actual.getState());
        System.out.printf("\n¿Esta vivo mi hilo? %s", actual.isAlive());

        System.out.println("\nJose maria ha recogido informacion sobre su hilo.");
    }
}
