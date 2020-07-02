
public class CompteEpargne extends Compte{
	private CompteCourant compteTransfet;
	private float montantTransfert;

	public CompteEpargne(long numero, Client client, CompteCourant compteTransfet, float montantTransfert) {
		super(numero, client);
		this.compteTransfet = compteTransfet;
		this.montantTransfert = montantTransfert;
	}
	

	public String toString() {
		return "Compte épargne n°"+this.getNumero()+", solde : "+this.getSolde()+"€";
	}
	
	public void transfert() {
		this.credit(this.getMontantTransfert());
		this.getCompteTransfet().debit(this.getMontantTransfert());
	}

	public CompteCourant getCompteTransfet() {
		return compteTransfet;
	}

	public void setCompteTransfet(CompteCourant compteTransfet) {
		this.compteTransfet = compteTransfet;
	}

	public float getMontantTransfert() {
		return montantTransfert;
	}

	public void setMontantTransfert(float montantTransfert) {
		this.montantTransfert = montantTransfert;
	}

}
