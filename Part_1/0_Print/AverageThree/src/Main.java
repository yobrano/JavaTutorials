void main() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the first value: ");
    int first = Integer.valueOf(reader.nextLine());
    System.out.println("The second: ");
    int second = Integer.valueOf(reader.nextLine());
    System.out.println("And the third: ");
    int  third = Integer.valueOf(reader.nextLine());
    System.out.println("Average (("+first+" + "+second+" + "+ third +") / 3): " + (first + second + third) / (double)3);
}
