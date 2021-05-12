package verifica_di_vincenzo;

import static java.lang.Thread.sleep;

public class Cuoco extends Thread {

    Bancone bancone = new Bancone();
    int numeroPiatto;

    public Cuoco(Bancone bancone, int numeroPiatto) {
        this.bancone = bancone;
        this.numeroPiatto = numeroPiatto;
    }

    public void run() {
        try {

            sleep((int) Math.random() * 2000); //tempo per preparare il piatto

        } catch (Exception e) {
        }

        bancone.deposita(numeroPiatto);
    }
}
