package EjTeoria.Lanzahilos;

public class lanzahilos {
    public static void main(String[] args) {
        Thread h1 = new Thread(new hilo("H1 de Jose maria"));
        Thread h2 = new Thread(new hilo("H2 de Jaime"));

        h1.start();
        h2.start();
    }
}
