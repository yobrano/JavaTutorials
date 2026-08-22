void main(){
    ArrayList<Integer> numbers = readNumbers(0);
    printNumbersInRange(numbers, 10, 20);
    System.out.println(sum(numbers));
}

ArrayList<Integer> readNumbers(int exitAt){
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    while(true){
        int number = Integer.valueOf(reader.nextLine());
        if(number == exitAt){
            break;
        }
        numbers.add(number);
    }
    return numbers;
}

void printNumbersInRange(ArrayList<Integer> numbers, int lowerbound, int upperbound){
    for (int number:numbers){
        if((number >= lowerbound) && (number <= upperbound)){
            System.out.println(number);
        }

    }
}

int sum(ArrayList<Integer> numbers){
    int total = 0;
    for(int number : numbers){
        total += number;
    }
    return total;
}