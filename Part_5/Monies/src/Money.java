public class Money{
    public final int euros;
    public final int cents;

    public Money(int euros, int cents){
        this.euros = euros;
        this.cents = cents;
    }

    public int cents(){
        return this.cents;
    }
    
    public int euros(){
        return this.euros;
    }


    public String toString(){
        String zeros = "";
        if(cents < 10){
            return this.euros + "."+zeros+this.cents+"e";
        }

        return this.euros+"."+this.cents+"e";
    }

    public Money plus(Money addition){
        int newCents = addition.cents() + this.cents;
        int newEuro = addition.euros() + this.euros;
        if(newCents >= 100){
            newEuro = newEuro +1;
            newCents = newCents % 100;
        }

        return new Money(newEuro, newCents);
    }


    public boolean lessThan(Money otherMoney){
        
        if(this.euros < otherMoney.euros() ){
            return true;
        }

        if(this.cents < otherMoney.cents()){
            return true;
        }

        return false;
    }

    public Money minus(Money otherMoney){
        
    }



}