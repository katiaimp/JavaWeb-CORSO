package JavaWeb_CORSO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1, "Katia", "katia@mail");
        Giocattolo g1 = new Giocattolo(1, "Barbie", 12.50 , 3);

        Vendita v1 = new Vendita(1, c1, g1);

        ArrayList<Vendita> listaVendita = new ArrayList<>();

        System.out.println(c1);
        System.out.println(g1);

        for(int i=0; i<listaVendita.size(); i++){
            
        }

        
    }
}