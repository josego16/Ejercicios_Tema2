package Ejercicio6;

public class puente {
    private final int capacidadMaxima;
    private final int pesoMaximo;
    private int pesoActual;

    public puente(int capacidadMaxima, int pesoMaximo) {
        this.capacidadMaxima = capacidadMaxima;
        this.pesoMaximo = pesoMaximo;
        this.pesoActual = 0;
    }

    public synchronized boolean sePermitePaso(int peso) {
        if (pesoActual + peso <= pesoMaximo) {
            pesoActual += peso;
            return true;
        } else {
            return false;
        }
    }

    public synchronized void finalizarPaso(int peso) {
        pesoActual -= peso;
        notifyAll();
    }
}
