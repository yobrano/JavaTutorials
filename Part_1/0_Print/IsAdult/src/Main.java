void main() {
    Scanner reader = new Scanner(System.in);
    System.out.println("What is your age:");
    int age = Integer.valueOf(reader.nextLine());
    if(age >= 18){
        System.out.println("You are an adult.");
    }else{
        System.out.print("You are not an adult.");
    }
}
