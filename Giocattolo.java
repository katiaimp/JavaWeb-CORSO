public class Giocattolo {
    private int id;
    private static String nome;
    private double prezzo;
    private int etaConsigliata;

    public Giocattolo(int id, String nome, double prezzo, int etaConsigliata){
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
        this.etaConsigliata = etaConsigliata;
    }

    public Giocattolo(){
        
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public void setEtaConsigliata(int etaConsigliata) {
        this.etaConsigliata = etaConsigliata;
    }

    public int getId() {
        return id;
    }
    public static String getNome() {
        return nome;
    }
    public double getPrezzo() {
        return prezzo;
    }
    public int getEtaConsigliata() {
        return etaConsigliata;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Giocattolo: " +this.getNome()+ ", prezzo= " +this.getPrezzo()+ " ed età consigliata: " +this.getEtaConsigliata();
    }
}
