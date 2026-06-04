package Es_3;

public class Carrello {

    //ATTRIBUTI 
    private Cliente cliente;
    private Articolo[] articolo;
    private double totalPrice;

    //COSTRUTTORE
    public Carrello(Cliente cliente, Articolo[] articolo, double totalPrice) {
        this.cliente = cliente;
        this.articolo = articolo;
        this.totalPrice = totalPrice;
    }
}
