import java.util.ArrayList;

public class Hold {
    private int maxWeight = 0;
    public int getMaxWeight(){
        return this.maxWeight;
    }

    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public int getWeight(){
        int totalWeight = 0;
        for(Suitcase suitcase : this.suitcases){
            totalWeight += suitcase.getWeight();
        }
        return totalWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if((suitcase.getWeight() + this.getWeight()) <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }

    public String toString(){
        if(this.suitcases.isEmpty()){
            return "No suitcases (" +this.getWeight() + " kg)";
        }else if(this.suitcases.size() == 1){
            return this.suitcases.size() + " suitcase(" +this.getWeight() + " kg)";
        }
        
        return this.suitcases.size() + " suitcases (" +this.getWeight() + " kg)";
    }


    public void printItems(){
        for(Suitcase suitcase: this.suitcases){
            for(Item item: suitcase.getItems()){
                System.out.println(item);
            }
        }
    }

    



}
