
public class ApartmentsComparisonApp {
    public static void main(String[] args) throws Exception {
        compareAppartments();
    }

    public static void compareAppartments(){
        Apartment kilimaniApartment = new Apartment(1, 16, 5500);
        Apartment dianiApartment = new Apartment(2, 38, 4200);
        Apartment riatApartment = new Apartment(3, 78, 2500);
        System.out.println(kilimaniApartment.largerThan(dianiApartment) +" that mwiki was larger.");

        System.out.println(kilimaniApartment.priceDifference(dianiApartment));
        System.out.println(dianiApartment.priceDifference(riatApartment));


        System.out.println(kilimaniApartment.moreExpensiveThan(dianiApartment));
        System.out.println(riatApartment.moreExpensiveThan(dianiApartment));


    }
}
