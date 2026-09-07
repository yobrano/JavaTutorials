import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       testArchiver();
    }

    public static void testArchiver(){
        Scanner promptReader = new Scanner(System.in);
        String identfier;
        String name;
        Archiver archy;
        ArrayList<Archiver> archies = new ArrayList<>();

        while (true) {   
            System.out.println("Identifier? (empty will stop)");
            identfier = promptReader.nextLine();
            if(identfier.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            name = promptReader.nextLine();
            if(name.isEmpty()){
                break;
            }

            archy = new Archiver(identfier, name);
            if(!(archies.contains(archy))){
                archies.add(archy);
            }else{
                // Do something if the item exists.
            }
        }


        System.out.println("==Items==");
       for(Archiver tempArchy : archies ){

           System.out.println(tempArchy.getID()+": "+tempArchy.getName());
       }
    
    }
}
