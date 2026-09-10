import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    
    public ArrayList<Item> getItems(){
        return this.items;
    }
    
    public void addItem(Item item){
        if((this.getWeight() + item.getWeight()) <= this.getMaxWeight()){
            this.items.add(item);
        } 
    }

    public int getWeight(){
        int tempWeight = 0;
        for(Item tempItem: this.items){
            tempWeight += tempItem.getWeight();
        }
        return tempWeight;
    }



    private int maximumWeight;
    public int getMaxWeight(){
        return this.maximumWeight;
    }

    public Suitcase(int maxSuitcaseWeight){
        this.maximumWeight = maxSuitcaseWeight;
    }

    public String toString(){
        if(this.items.isEmpty()){
            return "No items ("+this.getWeight()+" kg)";
        }else if(this.items.size() == 1){
            return "1 item ("+this.getWeight()+" kg)";
        }else {
            return this.items.size() + " items ("+this.getWeight()+" Kg)";
        }
    }


    public void printItems(){
        if(this.items.isEmpty()){
            System.out.println("The suitcase is empty.");
        }else{
            System.out.println("The suitcase contains the following items: ");
            for(Item item: this.items){
                System.out.println(item);
            }
        }
    }

    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heavyItm = this.items.get(0);
        for(Item item: this.items){
            if(item.getWeight() > heavyItm.getWeight()){
                heavyItm = item;
            }
        }

        return heavyItm;
    }


}
