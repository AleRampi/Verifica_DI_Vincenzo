package verifica_di_vincenzo;

import static java.lang.Thread.sleep;

public class Cuoco extends Thread {

    Bancone bancone = new Bancone();

    public Cuoco(Bancone bancone) {
        this.bancone = bancone;
    }

    @Override
    public void run() {
        try {

            sleep((int) Math.random() * 9000); //tempo per preparare il piatto

        } catch (Exception e) {
        }

        bancone.deposita();
    }
}
