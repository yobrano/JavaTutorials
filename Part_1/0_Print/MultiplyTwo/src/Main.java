void main() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the first value: ");
    int first = Integer.valueOf(reader.nextLine());
    System.out.println("And the second: ");
    int second = Integer.valueOf(reader.nextLine());
    System.out.println("Multiplication ("+first+" x "+second+"): " + (first * second));
}
