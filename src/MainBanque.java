public class MainBanque {

    public static void main( String [] argv ) {
        /**/
        Client martin = new Client(1,"Martin");
        Client dupond = new Client(2,"Dupond");
        System.out.println(martin.toString());
        System.out.println(dupond.toString());
        dupond.setNom("Pichon");
        System.out.println(dupond.toString());

        Compte com1 = new Compte(10,martin);
        Compte com2 = new Compte(20,dupond);
        System.out.println(com1);
        System.out.println(com2);
    }
}
