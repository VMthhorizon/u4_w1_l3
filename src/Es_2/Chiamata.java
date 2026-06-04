package Es_2;

public class Chiamata {

    // ATTRIBUTI
    private final double durata;
    private final String numCel;

    // COSTRUTTORE
    public Chiamata(double durata, String numCel) {
        this.durata = durata;
        this.numCel = numCel;
    }
    
    // OVERRIDE
    @Override
    public String toString() {
        return "Durata: " + durata + ", Numero:" + numCel;
    }
}
