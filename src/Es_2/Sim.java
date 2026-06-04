package Es_2;

import java.util.Arrays;

public class Sim {

    // ATTRIBUTI
    private int numTel;
    private double credito;
    private Chiamata[] listaChiamate;

    // COSTRUTTORI
    public Sim(int numTel) {
        this.numTel = numTel;
        this.credito = 0;
        this.listaChiamate = new Chiamata[5];
    }

    // METODI di ISTANZA
    public void printSim() {
        System.out.println("CREDITO RESIDUO: " + this.credito);
        System.out.println("NUMERO DI TELEFONO:" + this.numTel);
        System.out.println("ULTIME 5 CHIAMATE" + Arrays.toString(this.listaChiamate));
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.listaChiamate = chiamate;
    }
}
