public class Item{
    private String name;
    public String getName(){
        return this.name;
    }

    private int weight;
    public int getWeight(){
        return this.weight;
    }
    
    public Item(String itemName, int itemWeight){
        this.name = itemName;
        this.weight = itemWeight;
    }

    public String toString(){
        return this.name + " ("+this.weight+" kg)";
    }

    public boolean equals(Object other){
        if(other == this){
            return true;
        }

        if(!(other instanceof Item)){
            return false;
        }

        Item otherItem = (Item) other;
        if( (this.name.equals(otherItem.getName()))&&
            (this.weight == otherItem.getWeight()) ){
            return true;
        }
        return false;
    }
}