public class PetShopApp {
    public static void main(String[] args) throws Exception {
        testPet();
    }

    public static void testPet(){
        Pet zoom = new Pet("Zoom", "Parrot");
        Person harry = new Person("Harry", zoom);

        System.out.println(harry);
    }

}
