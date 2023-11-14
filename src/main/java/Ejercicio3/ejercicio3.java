package Ejercicio3;

public class ejercicio3 {
    public static void main(String[] args) {
        Thread h1 = new Thread(new hilo1("Jose maria"));
        Thread h2 = new Thread(new hilo2("Jaime"));
        Thread h3 = new Thread(new hilo1("Sara"));
        Thread h4 = new Thread(new hilo2("Javier"));
    }
}
