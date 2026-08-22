public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance){
        this.balance = initialBalance;
    }

    public String toString(){
        return "The card has a balance of: "+ this.balance + " euros.";
    }

    public void addMoney(double amount){
        if((this.balance + amount) > 150){
            this.balance = 150;
        }else{
            this.balance += amount;
        }
    }
    public void eatAffordably(){
        if((this.balance - 2.6) > 0){
            this.balance -= 2.6;
        }
    }

    public void eatHertily(){
        if((this.balance - 4.6) > 0){
            this.balance -= 4.6;
        }
    }

    public double getBalance(){
        return this.balance;
    }

}
