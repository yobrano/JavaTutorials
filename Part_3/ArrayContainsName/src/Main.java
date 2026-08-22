void main(){

    Scanner reader = new Scanner(System.in);
    ArrayList<String> names = readNames();
    System.out.print("Looking for: ");
    String name = reader.nextLine();

    if(names.contains(name)){
        System.out.print(name + " is in the list.");
    }else{
        System.out.println(name + " is NOT in the list.");
    }
}


ArrayList<String> readNames(){
    Scanner reader = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    while (true){
        String name = reader.nextLine();
        if(name.isEmpty()){
            break;
        }
        names.add(name);
    }
    return names;
}