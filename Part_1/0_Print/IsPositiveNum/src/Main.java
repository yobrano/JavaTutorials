void main() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Give me a number:");
    int number = Integer.valueOf(reader.nextLine());
    if(number > 0 ){
        System.out.println("The number is positive");
    }else{
        System.out.println("The number is not positive");
    }
}
