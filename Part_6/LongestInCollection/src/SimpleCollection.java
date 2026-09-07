import java.util.ArrayList;

public class SimpleCollection{
    private String name;
    public String getName(){
        return this.name;
    }

    private ArrayList<String> items = new ArrayList<>();

    public SimpleCollection(String collectionName){
        this.name = collectionName;
    }
    public void add(String item){
        this.items.add(item);
    }

    public String longest(){
        if(this.items.isEmpty()){
            return null;
        }

        String longestItem = this.items.get(0);
        for(String item: this.items){
            if(item.length() > longestItem.length()){
                longestItem = item;
            }
        }
        return longestItem;

    }

    public String toString(){

        if(this.items.isEmpty()){
            return "The collection "+this.name+" is empty";
        }
        
        String result = "The collection "+this.name+" has "+this.items.size();
        if(this.items.size() > 1){
            result += " items\n";
        }else{
            result += " item\n";
        }
        for(String item: items){
                result += (item+ "\n");
        }
        return result;

    }
}