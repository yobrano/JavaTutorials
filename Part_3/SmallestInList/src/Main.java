void main() {
    ArrayList<Integer> numbers = readIntegerList(9999);
    int smallest = getSmallest(numbers);
    System.out.println("Smallest: "+ smallest);
    printSmallestIndex(numbers);

}

ArrayList<Integer> readIntegerList(int exitAt){
    ArrayList<Integer> numbers = new ArrayList<>();
    Scanner reader = new Scanner(System.in);
    while (true){
        int number = Integer.valueOf(reader.nextLine());
        if( number == exitAt){
            break;
        }
        numbers.add(number);
    }
    return numbers;
}

int getSmallest(ArrayList<Integer> numbers){
    int smallest = numbers.get(0);
    for(int i = 0; i<numbers.size(); i++){
        if(smallest > numbers.get(i)){
            smallest = numbers.get(i);
        }
    }

    return smallest;
}

void printSmallestIndex(ArrayList<Integer> numbers){
    int number = getSmallest(numbers);
    for(int i=0; i<numbers.size();i++){
        if(number == numbers.get(i)){
            System.out.println("Smallest Index: " + i);
        }
    }
}
