void main() {
    Scanner reader = new Scanner(System.in);
    System.out.println("What is the first value:");
    int first = Integer.valueOf(reader.nextLine());
    System.out.println("What is the second:");
    int second = Integer.valueOf(reader.nextLine());
    if(first > second){
        System.out.println(first + " is greater.");
    }else if (second > first){
        System.out.println(second + " is greater.");
    }else{
        System.out.println("The the two values must be equal.");
    }
}
