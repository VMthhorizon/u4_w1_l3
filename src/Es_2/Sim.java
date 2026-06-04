package Es_2;

import java.util.Arrays;

public class Sim {

    // ATTRIBUTI
    private final String numTel;
    private final double credito;
    private Chiamata[] listaChiamate;

    // COSTRUTTORI
    public Sim(String numTel, Chiamata[] calls) {
        this.numTel = numTel;
        this.credito = 0;
        this.listaChiamate = calls;
    }

    // METODI di ISTANZA
    public void printSim() {
        System.out.println("CREDITO RESIDUO: " + this.credito);
        System.out.println("NUMERO DI TELEFONO:" + this.numTel);
        for (Chiamata chiamata : listaChiamate) {
            if (chiamata != null)
                System.out.println("ULTIME CHIAMATE: ");
            System.out.println(chiamata);
        }
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.listaChiamate = chiamate;
    }
}
