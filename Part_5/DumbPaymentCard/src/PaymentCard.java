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

    public boolean takeMoney(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance(){
        return this.balance;
    }

}
