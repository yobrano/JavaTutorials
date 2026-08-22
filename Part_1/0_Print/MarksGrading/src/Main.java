void main() {
    Scanner reader = new Scanner(System.in);
    System.out.println("What marks were scored:");
    int marks = Integer.valueOf(reader.nextLine());
    if(marks < 0){
        System.out.println("imposible");
    }else if(marks <= 49 ){
        System.out.println("Gfailed");
    }else if(marks <= 59){
        System.out.println("1");
    }else if(marks <= 69){
        System.out.println("2");
    }else if(marks <= 79){
        System.out.println("3");
    }else if(marks <= 89){
        System.out.println("4");
    }else if(marks <= 100){
        System.out.println("5");
    }else{
        System.out.println("incredible!");
    }
}
