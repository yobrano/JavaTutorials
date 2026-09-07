public class Gift {
    private String name;
    public String getName(){
        return this.name;
    }

    private int  weight;
    public int getWeight(){
        return this.weight;
    }


    public Gift(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public boolean equals(Object other){
        if(other == this){
            return true;
        }

        if(!(other instanceof Gift)){
            return false;
        }

        Gift otherGift = (Gift) other;
        if(
            (this.weight == otherGift.getWeight())&&
            (this.name.equals(otherGift.getName()))
        ){
            return true;
        }
        return false;

    }


    public String toString(){
        return this.name + " ("+this.weight+" kg)"; 
    }


}
