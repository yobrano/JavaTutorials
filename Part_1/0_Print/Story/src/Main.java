//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner reader = new Scanner(System.in);

    System.out.println("I will tell you a story but i need some information first.");
    System.out.println("What is the main character called?");
    String mainCharacter = reader.nextLine();
    System.out.println("What is their job?");
    String occupation = reader.nextLine();
    System.out.println("Here is a story:");
    System.out.println("Once upon a time there was "+ mainCharacter+ " who was a "+ occupation + ".");
    System.out.println("On the way to work "+mainCharacter+" reflected on life.");
    System.out.println("Perhaps "+mainCharacter+" will not be a "+ occupation +" forever.");


}
