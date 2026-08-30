public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int hertyMeals;
    
    public PaymentTerminal(double initialBalance){
        this.money = initialBalance;
        this.affordableMeals = 0;
        this.hertyMeals = 0;
    }


    public double eatAffordably(double payment){
        double mealPrice = 2.5;

        if(payment < mealPrice){
            return payment;
        }this.money+= mealPrice;
        this.affordableMeals++;
        return payment - mealPrice;
    }

    public boolean eatAffordably(PaymentCard card){
        double mealPrice = 2.5;

        if(card.getBalance() < mealPrice){
            return false;
        }
        card.takeMoney(mealPrice);
        this.affordableMeals++;
        return true;
    }


    
    public double eatHertily(double payment){
        double mealPrice = 4.3;

        if(payment < mealPrice){
            return payment;
        }
        this.money+= mealPrice; 
        this.hertyMeals++;
        return payment - mealPrice;
    }

    public boolean eatHertily(PaymentCard card){
        double mealPrice = 4.3;

        if(card.getBalance() < mealPrice){
            return false;
        }
        card.takeMoney(mealPrice);
        this.affordableMeals++;
        return true;
    }

    public String toString(){
        return "Register Balace: "+ this.money + 
        ", Number of affordable meals sold: "+this.affordableMeals +
        ", Number of herty meals sold: " + this.hertyMeals;

    }

}
