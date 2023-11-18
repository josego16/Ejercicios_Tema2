package Ejercicio4;

public class numeroOculto {
    private static int numeroOculto;
    private static boolean aleatorio = false;

    public static synchronized int proponerNumero(int num) {
        if (aleatorio) {
            return -1;
        } else if (num == numeroOculto) {
            aleatorio = true;
            return 1;
        } else {
            return 0;
        }
    }
}
