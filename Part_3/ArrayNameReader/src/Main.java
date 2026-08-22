void main() {
        ArrayList<String> names = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        while (true){
                String name = reader.nextLine();
                if (name.isEmpty()){
                        break;
                }
                names.add(name);

        }

        System.out.println(names.get(2));

}
