public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;
    
    public Apartment(int rooms, int squares, int pricePerSquare){
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int rooms(){
        return this.rooms;
    }

    public int getSquares(){
        return this.squares;
    }

    public int getPricePerSquare(){
        return this.pricePerSquare;
    }

    public int getPrice(){
        return this.pricePerSquare * this.squares;
    }


    public boolean largerThan(Apartment other){
        if(this.squares > other.getSquares()){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment other){
        return   other.getPrice() - this.getPrice();
    }

    public boolean moreExpensiveThan(Apartment other){
        return this.getPrice()  > other.getPrice();
    }
}   
