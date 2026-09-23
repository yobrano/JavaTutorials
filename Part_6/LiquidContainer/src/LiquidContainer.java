public class LiquidContainer{
    private int maxCapacity = 0;
    private String name = "";
    private int volume;

    public LiquidContainer(String name, int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.name = name;
        this.volume = 0;
    }

    public int getMaxCapacity(){
        return this.maxCapacity;
    }

    public String getName(){
        return this.name;
    }

    public int getVolume(){
        return this.volume;
    }

    public boolean equals(Object other){
        if(other == this){
            return true;
        }

        if(!(other instanceof LiquidContainer)){
            return false;
        }

        LiquidContainer otherContainer = (LiquidContainer) other;
        if(
            (otherContainer.getName().equals(this.name)) &&
            (otherContainer.getMaxCapacity() == this.maxCapacity)&&
            (otherContainer.getVolume() == this.volume)
        ){
            return true;
        }

        return false;
    }


    public String toString(){
        return this.name+" ( Volume: "+ this.volume +" ltr; Capacity: "+ this.maxCapacity +" ltr)";
    }

    public void add(int amount){
        int tempVolume = this.volume + amount;
        
        if(tempVolume > this.maxCapacity){
            this.volume = this.maxCapacity; 
        }
        this.volume = tempVolume;
    }


    public void move(){

    }

    public void remove(){

    }


        

}