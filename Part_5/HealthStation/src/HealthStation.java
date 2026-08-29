public class HealthStation {
    
    public int weighCounts;
    public HealthStation(){
        this.weighCounts = 0;
    }

    public int weigh(Person person){
        this.weighCounts++;
        return person.getWeight();
    }   

    public int weighings(){
        return this.weighCounts;
    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }




}
