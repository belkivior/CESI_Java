
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

    public void toString(){
        System.out.println("Client du compte " + numero + " est " + client.getNom());
    }

}
