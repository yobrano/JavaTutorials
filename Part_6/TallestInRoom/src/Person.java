public class Person{
    private String name = "";
    public String getName() {
        return name;
    }

    private int height = 0;
    public int getHeight() {
        return height;
    }

    public Person(String personName, int personHeight){
        this.name = personName;
        this.height = personHeight;
    }

    public String toString(){
        return this.name + " ("+this.height+" cm)";
    }

    public boolean equals(Object other){
        if(other == this){
            return true;
        }


        if(!(other instanceof Person)){
            return false;
        }
        Person otherPerson = (Person) other;
        if(
            this.name.equals(otherPerson.getName()) && 
            (this.height == otherPerson.getHeight())
        ){
            return true;
        }

        return false;



    }


}