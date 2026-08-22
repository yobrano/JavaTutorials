void main(){
    ArrayList<String> names = readNames();
    System.out.println(names);
    removeLast(names);
    removeLast(names);
    System.out.println(names);

}

ArrayList<String> readNames(){
    Scanner reader = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    while(true){
        String name = reader.nextLine();
        if(name.isEmpty()){
            break;
        }
        names.add(name);
    }

    return names;
}


void removeLast(ArrayList<String> names){
    if(names.size()>0){
        names.remove(names.size()-1);
    }
}