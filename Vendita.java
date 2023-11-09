import java.util.ArrayList;

public class Vendita {

    //Dati singolo acquisto
    private int idVendita;
    private Cliente c;
    private Giocattolo g;
    private ArrayList<Giocattolo> listaGiocattolo;
    
    public Vendita(int id, Cliente c, Giocattolo g){
        this.idVendita = id;
        this.c = c;
        this.g = g;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public void setG(Giocattolo g) {
        this.g = g;
    }

    public Cliente getC() {
        return c;
    }
    public Giocattolo getG() {
        return g;
    }

    public ArrayList<Giocattolo> getListaGiocattolo() {
        return listaGiocattolo;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Vendita: " +idVendita+ "\n Cliente: " +c+ " giocattolo: " +getListaGiocattolo();
    }

    
}
