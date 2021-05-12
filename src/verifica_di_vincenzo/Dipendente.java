package verifica_di_vincenzo;

public class Dipendente extends Thread {

    Bancone bancone = new Bancone();
    int numeroDipendenti;

    public Dipendente(Bancone bancone, int numeroDipendenti) {
        this.bancone = bancone;
        this.numeroDipendenti = numeroDipendenti;

    }

    @Override
    public void run() {
        while (numeroDipendenti > 0) {
            try {
                sleep((int) Math.random() * 9000); //Consuma
                bancone.preleva();
            } catch (Exception e) {
            }
            numeroDipendenti--;
        }

    }

}
