void main() {
    Scanner reader = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    while(true){

        int number = Integer.valueOf(reader.nextLine());
        if(number == 0){
            break;
        }
        numbers.add(number);
    }

    int total = numbers.get(1) + numbers.get(2);
    System.out.println(total);



}
