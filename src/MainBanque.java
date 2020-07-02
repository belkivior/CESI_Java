public class MainBanque {

    public static void main( String [] argv ) {
        /**/
        Client c1 = new Client(1,"Martin");
        System.out.println(c1);
        Compte com1 = new Compte(10,c1);
        Compte com2 = new Compte(20,c1);
        c1.addCompte(com1);
        c1.addCompte(com2);
        System.out.println(c1);

        com1.credit((float) 500.0);
        System.out.println(c1);
    }
}
