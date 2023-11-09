import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    private Permessi permesso;

    public Cliente(int id, String nome, String email, Permessi permesso){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.permesso = permesso.USER_BASE;
    }

    public Cliente(){

    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public Permessi getPermesso() {
        return permesso;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Cliente: " +this.getNome()+ " email: " +this.getEmail();
    }
}