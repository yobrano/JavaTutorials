public class Person{
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String pName, int pAge, int pHeight, int pWeight ){
        this.name = pName;
        this.age = pAge;
        this.height = pHeight;
        this.weight = pWeight;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String otherName){
        this.name = otherName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int otherAge){
        this.age = otherAge;
    }
    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int otherWeight){
        this.weight = otherWeight;
    }

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int otherHeight){
        this.height = otherHeight;
    }


    public double bodyMassIndex(){
        return (this.weight * 1.0) / (this.height * this.height);
    }

    


    public String toString(){
        String tempName;
        if(this.name.endsWith("s") ){
            tempName =  this.name+ "'";
        }else{
            tempName = this.name+"'s";
        }


        return tempName +" Weight: "+this.weight+" kg, Height: "+ this.height+" m";

    }

}