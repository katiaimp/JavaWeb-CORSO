import java.util.ArrayList;

public class Inventario {
   
    private ArrayList<Giocattolo> listaGiocattolo;
    
    public Inventario(ArrayList<Giocattolo>  giochi){
        this.listaGiocattolo = giochi;
    }

    public ArrayList<Giocattolo> getListaGiocattolo() {
        return listaGiocattolo;
    }

    public ArrayList<Giocattolo> aggiungiGiocattolo(Giocattolo g){
        listaGiocattolo.add(g);
        return listaGiocattolo;
    }

    public ArrayList<Giocattolo> rimuoviGiocattolo(Giocattolo g){
        
        if(listaGiocattolo.contains(g)){
            listaGiocattolo.remove(g);
        }
        return listaGiocattolo;
    }

    public ArrayList<Giocattolo> aggiornaGiocattolo (Giocattolo g, int id){
        for(int i=0; i<listaGiocattolo.size(); i++){
            if(listaGiocattolo.get(i).getId() == id){
                listaGiocattolo.set(i, g);
            }
        }
        return listaGiocattolo;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "L'inventario è costituito da: " +listaGiocattolo.size()+ " giocattoli \n" + Giocattolo.getNome();
    }

}
