package Es_3;

import java.util.Date;

public class Cliente {

    // ATTRIBUTI
    private String idCliente;
    private String nome;
    private String cognome;
    private String email;
    private Date dataIscrizione;

    // COSTRUTTORE
    public Cliente(String idCliente, String nome, String cognome, String email, Date dataIscrizione) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }
}
