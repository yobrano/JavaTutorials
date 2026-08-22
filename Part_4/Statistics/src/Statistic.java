public class Statistic {
    private int count;
    private int sum;
    private double average;

    public Statistic(){

    }

    public void addNumber(int number){
        this.sum += number;
        this.count++;
    }
    public int getCount(){
        return this.count;
    }

    public int getSum(){
        return this.sum;
    }

    public double getAverage(){
        return (1.0 * this.sum)/this.count;
    }
}
