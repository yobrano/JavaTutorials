void main() {
    while(true) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shall we carry on?");

        String response = reader.nextLine();

        if (response.equals("no")) {
            System.out.println("Okay, fare well.");
            break;
        }
    }

}
