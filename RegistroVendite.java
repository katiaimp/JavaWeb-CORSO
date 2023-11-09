import java.util.ArrayList;

public abstract class RegistroVendite {
    private static ArrayList<Vendita> listaVendita;
    
    public RegistroVendite(ArrayList<Vendita>  v){
        this.listaVendita = v;
    }

    public static ArrayList<Vendita> getListaVendita() {
        return listaVendita;
    }

    public ArrayList<Vendita> aggiungiVendita(Vendita v1){
        listaVendita.add(v1);
        return listaVendita;
    }

    public ArrayList<Vendita> rimuoviVendita(Vendita v1){
        
        if(listaVendita.contains(v1)){
            listaVendita.remove(v1);
        }
        return listaVendita;
    }

    public ArrayList<Vendita> aggiornaVendita (Vendita v, int id){
        for(int i=0; i<listaVendita.size(); i++){
            if(listaVendita.get(i).getIdVendita() == id){
                listaVendita.set(i, v);
            }
        }
        return listaVendita;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Registro vendite: " +listaVendita.size()+ " vendite effettuate";
    }

}
