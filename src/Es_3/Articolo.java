package Es_3;

public class Articolo {

    // ATTRIBUTI
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int stock;

    // COSTRUTTORE
    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int stock) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.stock = stock;
    }
}
