public class App {
    public static void main(String[] args) throws Exception {
        Person ethan = new Person("Ethan", 10, 1, 47);
        Person peter = new Person("Peter",33, 2, 83);

        HealthStation stFrancisHsp  = new HealthStation();

        System.out.println(ethan.getName() + "'s weight: "+ stFrancisHsp.weigh(ethan));
        System.out.println(peter.getName() + "'s weight: "+ stFrancisHsp.weigh(peter));


        stFrancisHsp.feed(ethan);
        stFrancisHsp.feed(ethan);
        stFrancisHsp.feed(ethan);

        System.out.println("");
        System.out.println(ethan.getName() + "'s weight: "+ stFrancisHsp.weigh(ethan));
        System.out.println(peter.getName() + "'s weight: "+ stFrancisHsp.weigh(peter));

        System.out.println("Weigh Counts: "+ stFrancisHsp.weighings());

    }
}
