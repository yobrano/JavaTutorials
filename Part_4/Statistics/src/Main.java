void main() {
    readEvenAndOdd();
}

void readEvenAndOdd(){
    Scanner reader = new Scanner(System.in);
    Statistic evenStats = new Statistic();
    Statistic oddStats = new Statistic();

    while (true){
        int number = Integer.valueOf(reader.nextLine());
        if(number < 0){
            break;
        }
        if((number %2) == 0){
            evenStats.addNumber(number);
        }else{
            oddStats.addNumber(number);
        }
    }

    System.out.println("Even Sum: "+ evenStats.getSum());
    System.out.println("Odd Sum:  "+ oddStats.getSum());


}

void readNumber(){
    Scanner reader = new Scanner(System.in);
    Statistic stats = new Statistic();

    while (true){
        int number = Integer.valueOf(reader.nextLine());
        if(number < 0){
            break;
        }

        stats.addNumber(number);
    }

    System.out.println("Sum:     "+ stats.getSum());
    System.out.println("Count:   "+ stats.getCount());
    System.out.println("Average: "+ stats.getAverage());


}