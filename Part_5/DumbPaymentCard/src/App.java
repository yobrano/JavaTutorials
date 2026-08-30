public class App {
    public static void main(String[] args) throws Exception {
        testCardInTerminal();
    }

    public static void testCardInTerminal(){
        PaymentTerminal uniCafe = new PaymentTerminal(1000);
        double change = uniCafe.eatAffordably(10);
        System.out.println("Change: "+ change);
        
        PaymentCard petesCard = new PaymentCard(10);
        boolean wasSuccessful = uniCafe.eatAffordably(petesCard);
        System.out.println("Pete's card puchase was successfull: "+ wasSuccessful);
        System.out.println("pete's balance is $"+petesCard.getBalance());

        wasSuccessful = uniCafe.eatAffordably(petesCard);
        System.out.println("Pete's card puchase was successfull: "+ wasSuccessful);
        System.out.println("pete's balance is $"+petesCard.getBalance());

        System.out.println(uniCafe);
    }
    public static void testTerminal(){
        PaymentTerminal uniCafe = new PaymentTerminal(1000);
        double change = uniCafe.eatAffordably(10);
        System.out.println("Change: "+ change);


        change = uniCafe.eatAffordably(5);
        System.out.println("Change: "+ change);

        change = uniCafe.eatHertily(4.3);
        System.out.println("Change: " + change);

        System.out.println(uniCafe);

    }


    public static void testCard(){
        PaymentCard petesCard = new PaymentCard(10);
        System.out.println("pete's balance is $"+petesCard.getBalance());
        boolean wasWidthdrawn = petesCard.takeMoney(8);
        System.out.println("Was Successfull in withdrawing : "+ wasWidthdrawn);
        System.out.println("pete's balance is $"+petesCard.getBalance());
        
        wasWidthdrawn = petesCard.takeMoney(4);
        System.out.println("Was Successfull in withdrawing : "+ wasWidthdrawn);
        System.out.println("pete's balance is $"+petesCard.getBalance());    
    }
}
