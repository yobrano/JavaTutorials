public class App {
    public static void main(String[] args) throws Exception {
            Song shanti = new Song("Ted Elliot", "Hoist the Colours" , 180);
            Song antherShanti = new Song("Ted Elliot", "Hoist the Colours" , 180);
            Song johny = new Song("Brian Tyler", "Leave her Johnny" , 180);

            if(shanti.equals(shanti)){
                System.out.println("Shanti is Shanti.");
            }else{
                System.out.println("Shantis are not identical");
            }


            if(shanti.equals(antherShanti)){
                System.out.println("The two Shantis are the same.");
            }else{
                System.out.println("The who Shantis are not the same.");
            }

            if(johny.equals(shanti)){
                System.out.println("Johny is a shanti as well.");
            }else{
                System.out.println("Johny is a not a normal shanti.");
            }

    }
}
