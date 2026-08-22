void main() {
    ArrayList<Integer> numbers = readIntegerList(9999);
    int total = 0;
    int count = 0;
    for (int i:numbers ){
        total += i;
        count++;
    }
    System.out.println("Total: "+ total);
    System.out.println("Average: "+ ((1.0 * total) / count));

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