package verifica_di_vincenzo;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;

public class Bancone {
    
    Semaphore pieno = new Semaphore(0);
    Semaphore vuoto = new Semaphore(5);
    
    private int numeroPiatto;
    
    public void deposita(int numeroPiatto){
        try {
            vuoto.acquire();
        } catch (Exception e) {
        }
        this.numeroPiatto = numeroPiatto;
        System.out.println("Il piatto numero " + numeroPiatto + " è pronto.");
        pieno.release();
    }
    
    public void preleva() throws InterruptedException{
        try {
            pieno.acquire();
        } catch (Exception e) {
        }
        
        System.out.println("Il piatto numero " + numeroPiatto + " è stato consumato.");
        vuoto.release();    
    }
    
}
