import java.time.LocalDateTime;

public class Vendita extends RegistroVendite{

    //Dati singolo acquisto
    private int idVendita;
    private Cliente c;
    private Giocattolo g;
    double prezzoGiocattolo;
    int quantita;
    private LocalDateTime data;

    //private ArrayList<Giocattolo> listaGiocattolo;
    
    public Vendita(int id, Cliente c, Giocattolo g, double pg, int quantita, LocalDateTime data){
        super(getListaVendita());
        this.idVendita = id;
        this.c = c;
        this.g = g;
        this.prezzoGiocattolo = pg;
        this.quantita = quantita;
        this.data = data;
        
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public void setG(Giocattolo g) {
        this.g = g;
    }
    public void setPrezzoGiocattolo(double prezzoGiocattolo) {
        this.prezzoGiocattolo = prezzoGiocattolo;
    }
    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getIdVendita() {
        return idVendita;
    }
    public Cliente getC() {
        return c;
    }
    public Giocattolo getG() {
        return g;
    }
    public double getPrezzoGiocattolo() {
        return prezzoGiocattolo;
    }
    public int getQuantita() {
        return quantita;
    }
    public LocalDateTime getData() {
        return data;
    }

    /*public ArrayList<Giocattolo> getListaGiocattolo() {
        return listaGiocattolo;
    }*/

    @Override
    public String toString() {
        
        return "Vendita: " +idVendita+ "\n Cliente: " +c+ " giocattolo: "+ "\n quantità: " +quantita +" prezzo= " +prezzoGiocattolo+ "\n data di acquisto: " +data;
    }

    
}
