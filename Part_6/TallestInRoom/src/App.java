public class App {

      public static String yellowString(String text){
        return "\u001B[33m" +text+"\u001B[0m";
    };
    public static void main(String[] args) throws Exception {
        testPerson();
        testRoom();
    }

    public static void testPerson(){
        System.out.println(yellowString("=== TESTING PERSON ==="));
        Person lea = new Person("Lea", 183);
        System.out.println(lea);
    }

    public static void testRoom(){
        // Room room = new Room();
        // System.out.println("Shortest: " + room.shortest());
        // System.out.println("Empty room? " + room.isEmpty());
        // room.add(new Person("Lea", 183));
        // room.add(new Person("Kenya", 182));
        // room.add(new Person("Auli", 186));
        // room.add(new Person("Nina", 172));
        // room.add(new Person("Terhi", 185));
        // System.out.println("Empty room? " + room.isEmpty());

        // System.out.println("");
        // for (Person person : room.getPersons()) {
        //     System.out.println(person);
        // }

        // System.out.println();
        // System.out.println("Shortest: " + room.shortest());
        // System.out.println("");
        // for (Person person : room.getPersons()) {
        //     System.out.println(person);
        // }



        Room room = new Room();
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }


    }
}
