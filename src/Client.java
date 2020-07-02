import java.util.ArrayList;
import java.util.List;

public class Client {

    private long numero;
    private String nom;
    private List<Compte> comptesCli;

    Client (long numero, String nom){
        this.numero = numero;
        this.nom = nom;
    }

    public long getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void addCompte(Compte c){
        if(comptesCli == null) {
            this.comptesCli = new ArrayList<Compte>();
        }
        comptesCli.add(c);
    }

    public List<Compte> getComptes(){
        return comptesCli;
    }

    @Override
    public String toString() {
        if(comptesCli == null) {
            return "Client " + numero + " - " + nom + "\n pas de compte rattaché à ce client";
        }
        long num;
        float solde;
        String compteCli = "Client " + numero + " - " + nom ;
        for (Compte c: comptesCli) {
            compteCli += "\n Compte n°"  + c.getNumero() + " - solde : " + c.getSolde();
        }
        return compteCli;
    }

    // Client 1 - Gold
    // Compte n°10 - solde : 0.0
    //Compte n°20 - solde :
}

