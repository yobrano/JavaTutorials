void main() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Number to assess:");
    int number = Integer.valueOf(reader.nextLine());
    if(number < 0){
        number = number * -1;
    }
    System.out.println("Abs: "+number);
    }
