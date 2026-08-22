void main() {
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();

    while(true){
        int number = Integer.valueOf(reader.nextLine());
        if(number == -1){
            break;
        }
        numbers.add(number);
    }

    System.out.println("Greatest number: "+ getLargest(numbers));
    printIndex(numbers);

}

void printIndex(ArrayList<Integer> numbers){
    Scanner reader = new Scanner(System.in);
    System.out.print("Looking for what number: ");
    int number = Integer.valueOf(reader.nextLine());

    for(int i = 0; i<numbers.size(); i++) {
        if (numbers.get(i) == number) {
            System.out.println("Found at: "+ i);
        }
    }
}
int getLargest(ArrayList<Integer> numbers){
    int largest = numbers.get(0);

    for (int i= 0; i < numbers.size(); i++){
        if( largest < numbers.get(i)){
            largest = numbers.get(i);
        }
    }
    return largest;

}
