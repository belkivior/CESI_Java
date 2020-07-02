import java.util.ArrayList;
import java.util.List;

public class BanqueApp {

    public static void main( String [] argv ) {
        Client c1 = new Client(1,"Client1");
        Client c2 = new Client(2,"Client2");
        Client c3 = new Client(3,"Client3");
        Client c4 = new Client(3,"Client4");
        List<Client> banque = new ArrayList<Client>();
        banque.add(c1);
        banque.add(c2);
        banque.add(c3);
        banque.add(c4);
        for (Client client: banque) {
            System.out.println(client);
            // créer un compte courant pour le client
            CompteCourant cCourant = new CompteCourant(client.getNumero()*1000 +1, client);
            // créer un compte épargne pour le client
            CompteEpargne cEpargne = new CompteEpargne(client.getNumero()*1000+2,client,cCourant,50);
            // ajouter les 2 comptes au client
            client.addCompte(cCourant);
            client.addCompte(cEpargne);
            System.out.println(client);           
            
        }
    }
}