public class Song {
    private String name;
    private int length;

    public Song(String initialName, int initalLength) {
        this.name = initialName;
        this.length = initalLength;
    }

    public String name(){
        return this.name;
    }

    public int length(){
        return this.length;
    }
}
