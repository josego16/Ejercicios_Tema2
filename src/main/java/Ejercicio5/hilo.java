package Ejercicio5;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class hilo extends Thread {
    cuentaBancaria c1, c2;

    @Override
    public void run() {
        int cantidadATransferir = 10;
        int numTransferencias = 0;

        for (int i = 0; i < 1000; i++) {
            if (gestorTransferencias.transferencia(c1, c2, cantidadATransferir))
                numTransferencias++;
        }
        String msg = "Fin transferencia de la cuenta " + this.c1.getNumeroCuenta();
        msg += " a la cuenta " + this.c2.getNumeroCuenta();
        msg += " Realizada por el hilo " + this.getName();
        msg += " por " + numTransferencias + " realizadas\n";
        System.out.println(msg);
    }
}