package verifica_di_vincenzo;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Bancone bancone = new Bancone();
        Dipendente dipendente = new Dipendente(bancone, 4);
        
        dipendente.start();
        for (int i = 1; i < 5; i++) {
            Cuoco cuoco = new Cuoco(bancone);
            cuoco.start();
        }
        for (int i = 1; i < 5; i++) {
            Cuoco cuoco = new Cuoco(bancone);
            cuoco.join();
        }
        
        dipendente.join();
        System.out.println("Fine pausa pranzo.");
    }
    
}
