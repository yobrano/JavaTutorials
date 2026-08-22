void main() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter an age:");
    int age = Integer.valueOf(reader.nextLine());

    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(age);

    System.out.println("Ages: " + ages.get(0));

}
