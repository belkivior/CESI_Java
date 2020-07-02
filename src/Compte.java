
public class Compte {

    private long numero;
    private Client client;
    private float solde;

    public Compte(long num, Client c){
        this.numero = num;
        this.client = c;
    }

    public float getSolde(){
        return this.solde;
    }

    public Client getClient(){
        return this.client;
    }

    public long getNumero(){
        return this.numero;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "client=" + client.getNom() +
                '}';
    }
}
