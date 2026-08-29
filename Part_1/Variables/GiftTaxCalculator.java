import java.util.Scanner;

public class GiftTaxCalculator {
    public static void main(String[] args){
        System.out.println("Value of the gift?");
        Scanner reader = new Scanner(System.in);
        double giftAmount = Double.valueOf(reader.nextLine());
        double taxAmount = 0.0;
        if(giftAmount >= 5000 && giftAmount <= 25000){
            taxAmount = 100 + (giftAmount - 5000)* 0.08;
        }else if(giftAmount > 25000 && giftAmount <= 55000){
            taxAmount = 1700 + (giftAmount - 25000)* 0.10;
        }else if(giftAmount > 55000 && giftAmount <= 200000){
            taxAmount = 4700 + (giftAmount - 55000)* 0.12;
        }else if(giftAmount > 200000 && giftAmount <= 1000000){
            taxAmount = 22100 + (giftAmount - 200000)* 0.15;
        }else if(giftAmount > 1000000 ){
            taxAmount = 142100 + (giftAmount - 1000000)* 0.17;
        }

        
        if(taxAmount > 0){
            System.out.println("Tax: "+taxAmount);
        }else{
            System.out.println("No tax!");
        }
        
    }
}
