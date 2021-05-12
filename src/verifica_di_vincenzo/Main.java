package verifica_di_vincenzo;

/**
 * 
 * @author Alessandro Di Vincenzo
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Bancone bancone = new Bancone();
        Dipendente dipendente = new Dipendente(bancone, 5);
        
        dipendente.start();
        for (int i = 0; i < 5; i++) {
            Cuoco cuoco = new Cuoco(bancone);
            cuoco.start();
        }
        for (int i = 0; i < 5; i++) {
            Cuoco cuoco = new Cuoco(bancone);
            cuoco.join();
        }
        
        dipendente.join();
        System.out.println("Fine pausa pranzo.");
    }
    
}
