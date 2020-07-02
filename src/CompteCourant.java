
public class CompteCourant extends Compte {
	public CompteCourant(long numero, Client client) {
		super(numero, client);
	}
	public String toString() {
		return "Compte courant n° "+this.getNumero()+", solde : "+this.getSolde()+" €";
	}
}

