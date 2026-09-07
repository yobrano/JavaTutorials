import java.util.ArrayList;

public class Room{
    
    private ArrayList<Person> persons = new ArrayList<>();
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    public void add(Person person){
        this.persons.add(person);
    }

    public boolean isEmpty(){
        return this.persons.isEmpty();
    }

    public Person shortest(){
        if(this.persons.isEmpty()){
            return null;
        }

        Person shortestPerson = this.persons.get(0);
        for(Person person: this.persons){
            if(person.getHeight() < shortestPerson.getHeight()){
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }


    public Person take(){
        int counter = 0;
        int shortestPersonIndex = 0;
        Person shortestPerson = this.persons.get(0);
        
        for(Person person: this.persons){
            counter++;
            if(shortestPerson.getHeight() < person.getHeight() ){
                shortestPersonIndex = counter;
                shortestPerson = person;
            }
        }
        return this.persons.remove(shortestPersonIndex);
    }
    public Room(){
    }
}