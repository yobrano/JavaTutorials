//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the speed (km/h):");
    int speed = Integer.valueOf(reader.nextLine());
    if(speed > 180){
        System.out.println("Speed ticket!");

    }
    System.out.println("Remember to drive safely.");
}
