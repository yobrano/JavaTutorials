import java.util.ArrayList;

public class SimpleDictionary{
    
    ArrayList<String[]> dictionaryEntries;
    public ArrayList<String[]> getWords(){
        return this.dictionaryEntries;
    }

    public void add(String english, String fin){
        String[] definition = {english, fin};
        this.dictionaryEntries.add(definition);
    }

    public void printWords(){
        if(this.dictionaryEntries.isEmpty()){
            System.out.println("No words are present.");
        }
        for(String[] translation: this.dictionaryEntries){
            System.out.println(translation[0]+" : "+translation[1]); 
        }
    }

    public String translate(String english){
        for(String[] translation: this.dictionaryEntries){
            if(translation[0].equals(english)){
                return translation[1];
            }
        }
        return null;
    }
    

    public SimpleDictionary(){
        this.dictionaryEntries = new ArrayList<>();
    }

    public String toString(){
        if(this.dictionaryEntries.isEmpty()){
            return "There are no translations";
        }

        if(this.dictionaryEntries.size() == 1){
            return "Only one word is defined.";
        }

        return this.dictionaryEntries.size() + " words are defined.";
    }

    public String search(String word) {
        for(String[] dictionaryEntry : this.dictionaryEntries){
            if(dictionaryEntry[0].equals(word) ){
                return dictionaryEntry[1];
            }
        }
        
        return null;
    }

    
    
}