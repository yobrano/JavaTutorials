public class Agent {
    private String firstName;
    private String secondName;

    public Agent(String initialFirstName, String initialSecondName){
        this.firstName = initialFirstName;
        this.secondName = initialSecondName;
    }


    public String toString(){
        return "My name is "+ this.secondName+", "+ this.firstName+" "+ this.secondName;
    }
}
