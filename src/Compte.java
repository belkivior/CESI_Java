
public abstract class Compte {
	private long numero;
	private Client client;
	private float solde;
	

	public Compte(long numero, Client client) {
		super();
		this.numero = numero;
		this.client = client;
		this.solde =0;
	}
	
	public float getSolde() {
		return this.solde;
	}

	public Client getClient() {
		return this.client;
	}
	
	public long getNumero() {
		return this.numero;
	}
	
	public void setSolde(float solde) {
		this.solde = solde;
	}
	
	public void credit(float montant) {
		this.setSolde(this.getSolde()+montant);
	}
	
	public void debit(float montant) {
		this.setSolde(this.getSolde() - montant);
	}
	
	public abstract String toString();
	
	
}
