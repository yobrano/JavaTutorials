import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts ;
    public ArrayList<Gift> getGifts(){
        return this.getGifts();
    }

    public Package(){
        this.gifts = new ArrayList<>();

    }

    public int totalWeight(){
        int weight = 0;
        for(Gift gift: this.gifts){
            weight += gift.getWeight();
        }
        return weight;
    }

    public void addGift(Gift gift){
        this.gifts.add(gift);
    }


    public boolean contains(Gift gift){
        return this.gifts.contains(gift);
    }

    
    public String toString(){
        if(this.gifts.isEmpty()){
            return "There are no gifts in this package.";
        }

        StringBuilder response = new StringBuilder();
        response.append("This package ("+ this.totalWeight()+" kg) has "+ this.gifts.size()+" ");

        
        if(this.gifts.size() == 1){
            response.append("gift: \n");
        }else{
            response.append("gifts: \n");
        }

        for(Gift gift: this.gifts){
            response.append("\t"+gift.toString()+"\n");
        }
        return response.toString();

    }




}   
