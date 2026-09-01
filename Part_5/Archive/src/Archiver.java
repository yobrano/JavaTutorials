public class Archiver {
    private String name;
    private String identifier;

    public Archiver(String archiveID, String archiveName){
        this.name = archiveName;
        this.identifier = archiveID;
    }

    public String getName(){
        return this.name;
    }
    public String getID(){
        return this.identifier;
    }

    public String toString(){
        return this.identifier + " : "+ this.name;
    }

    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        if(!(other instanceof Archiver)){
            return false;
        }
        Archiver otherArchiver = (Archiver) other;
        if(
            (this.identifier.equals(otherArchiver.getID())) && 
            (this.name.equals(otherArchiver.getName()))
        ){
            return true;
        }
        return false;

    }


}
