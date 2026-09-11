import java.util.ArrayList;

public class SimpleDictionary{
    
    ArrayList<String[]> words;
    public ArrayList<String[]> getWords(){
        return this.words;
    }

    public void add(String english, String fin){
        String[] definition = {english, fin};
        this.words.add(definition);
    }

    public void printWords(){
        if(this.words.isEmpty()){
            System.out.println("No words are present.");
        }
        for(String[] translation: this.words){
            System.out.println(translation[0]+" : "+translation[1]); 
        }
    }

    public String translate(String english){
        for(String[] translation: this.words){
            if(translation[0].equals(english)){
                return translation[1];
            }
        }
        return null;
    }
    

    public SimpleDictionary(){
        this.words = new ArrayList<>();
    }

    public String toString(){
        if(this.words.isEmpty()){
            return "There are no translations";
        }

        if(this.words.size() == 1){
            return "Only one word is defined.";
        }

        return this.words.size() + " words are defined.";
    }

    
    
}