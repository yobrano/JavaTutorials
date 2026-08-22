void main() {
    ArrayList<Integer> numbers =  new ArrayList<>();
    Scanner reader = new Scanner(System.in);
    while(true){
        int number = Integer.valueOf(reader.nextLine());
        if(number == -1){
            break;
        }
        numbers.add(number);
    }
    printRange(numbers);
    printNumbers(numbers);


}

void printNumbers(ArrayList<Integer> numbers){
    for(int i= 0; i<numbers.size(); i++){
        System.out.println(numbers.get(i));
    }
}

void printRange(ArrayList<Integer> numbers){
    Scanner reader = new Scanner(System.in);
    System.out.print("Starting: ");
    int start = Integer.valueOf(reader.nextLine());
    System.out.print("Ending: ");
    int end = Integer.valueOf(reader.nextLine());

    for (int i = start; i<= end; i++){
        System.out.println(numbers.get(i));
    }
}