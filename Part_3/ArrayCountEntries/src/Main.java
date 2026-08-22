void main() {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    while (true){
        String name = reader.nextLine();
        if(name.isEmpty()){
            break;
        }
        names.add(name);
    }

    printCount(names);
    printFirst(names);
    printLast(names);

}
void printCount(ArrayList<String> names){
    System.out.println("List size: " + names.size());
}

void printFirst(ArrayList<String> names){
    System.out.println("first item: "+ names.getFirst());
}
void printLast(ArrayList<String> names){
    int lastIndex = names.size() -1;
    System.out.println("last item: " + names.getLast());
}