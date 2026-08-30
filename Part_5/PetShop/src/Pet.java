public class Pet {
    private String name;
    private String breed;


    public Pet(String petName, String petBreed){
        this.name = petName;
        this.breed = petBreed;
    }

    public String getName(){
        return this.name;
    }

    public String getBreed(){
        return this.breed;
    }

    public String toString(){
        return this.name+" ("+ this.breed+")";
    }

}
