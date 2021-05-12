package verifica_di_vincenzo;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        Bancone bancone = new Bancone();
        Dipendente dipendente = new Dipendente(bancone, 10);
        
        dipendente.start();
        for (int i = 1; i < 10; i++) {
            Cuoco cuoco = new Cuoco(bancone, i);
            cuoco.start();
        }
        for (int i = 1; i <10; i++) {
            Cuoco cuoco = new Cuoco(bancone, i);
            cuoco.join();
        }
        
        dipendente.join();
        System.out.println("Fine della mensa.");
    }
    
}
