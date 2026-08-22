void main(){
//    printThreeTimes();
//    isTrue();
//    login();
//    lineByLine();
//    avClub();
//    lastWords();
//    secretMessage();
//    oldest();
    personDetail();
}



void printThreeTimes(){
    System.out.print("Give a word: ");
    Scanner reader = new Scanner(System.in);
    String word = reader.nextLine();
    System.out.println(word + word + word);
}


void isTrue(){
    System.out.print("Give a string: ");
    Scanner reader = new Scanner(System.in);
    String str = reader.nextLine();
    if(str.equals("true")){
        System.out.println("You got it right!");
    }else{
        System.out.println("Try again!");
    }
}

void login (){
    ArrayList<ArrayList<String>> users = new ArrayList<>();
    ArrayList<String> emma = new ArrayList<>();
    emma.add("Emma");
    emma.add("huskell");
    users.add(emma);


    ArrayList<String> alex = new ArrayList<>();
    alex.add("alex");
    alex.add("sunshine");
    users.add(alex);

    validateCredential(users);

}
void validateCredential( ArrayList<ArrayList<String>> users){
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter Username: ");
    String username = reader.nextLine();
    System.out.print("Enter pasword: ");
    String password = reader.nextLine();

    boolean isLoggedIn= false;
    for(ArrayList<String> user:users){
        if((username.equals(user.get(0))) && (password.equals(user.get(1)) )){
                isLoggedIn = true;
                break;
        }
    }

    if(isLoggedIn){
        System.out.println("You have successfully logged in.");

    }else{
        System.out.println("Incorrect username or password.");
    }
}


void lineByLine(){
    Scanner reader = new Scanner(System.in);
    String statement = reader.nextLine();
    String[] words = statement.split(" ");
    for (String word:words){
        System.out.println(word);
    }
}

void avClub(){
    Scanner reader = new Scanner(System.in);
    String statement = reader.nextLine();
    String[] words = statement.split(" ");
    for (String word:words){
        if(word.contains("av")){
            System.out.println(word);
        }
    }
}

void lastWords(){
    Scanner reader = new Scanner(System.in);
    String statement = reader.nextLine();
    String[] words = statement.split(" ");
    System.out.println(words[words.length - 1]);

}

void secretMessage(){
    String paragraph = "Polymorphous computations elaborate. " +
            "Real Calculators honor. " +
            "Older Desktops deliver. " +
            "Great mainframes link. " +
            "Reversed devices install. " +
            "Additional workstations modem. " +
            "Many microcomputers letter.";

    // First letter of the sentence. or first letter index 0 for every 3 words.

    String[] sentences = paragraph.split("\\. ");
    for (String sentence:sentences){

        System.out.print(sentence.charAt(0));
    }

}

void oldest(){
    Scanner reader = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> ages = new ArrayList<>();

    while (true){
        String person = reader.nextLine();
        if(person.isEmpty()){
            break;
        }

        String[] personInfo = person.split(",");
        String name = personInfo[0];
        names.add(name);
        int age = Integer.valueOf(personInfo[1]);
        ages.add(age);

    }

    int maxAge = ages.get(0);
    for(int age: ages){
        if(age > maxAge){
            maxAge = age;
        }
    }

    System.out.println("Age of oldest: "+ maxAge);
}


void personDetail(){
    Scanner reader = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    ArrayList<Integer> birthYears = new ArrayList<>();

    while (true){
        String person = reader.nextLine();
        if(person.isEmpty()){
            break;
        }

        String[]personInfo =  person.split(",");
        String name = personInfo[0];
        names.add(name);
        int yob = Integer.valueOf(personInfo[1]);
        birthYears.add(yob);
    }


    double totalAge = 0;
    int maxNameSize = 0;
    int maxNameIdx = 0;
    for(int i= 0; i < names.size(); i++){
        totalAge += birthYears.get(i);

        if(maxNameSize < names.get(i).length()){
            maxNameSize = names.get(i).length();
            maxNameIdx = i;
        }
    }

    System.out.println("Longest name: "+ names.get(maxNameIdx));
    System.out.println("Average of birth years: "+(totalAge / birthYears.size()));

}