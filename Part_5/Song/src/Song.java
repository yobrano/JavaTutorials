public class Song {
    private String artist;
    private String name;
    private int length;
    public Song(String initaArtist, String initialName, int initalLength) {
        this.artist = initaArtist;
        this.name = initialName;
        this.length = initalLength;
    }

    public String getArtist(){
        return this.artist;
    }

    public String getName(){
        return this.name;
    }

    public int getLength(){
        return this.length;
    }

    public boolean equals(Object other){
        if(this == other){
            return true;
        }


        if(!(other instanceof Song)){
            return false;
        }

        Song otherSong = (Song) other;
        if(
            (this.name.equals(otherSong.getName()))&&
            (this.artist.equals(otherSong.getArtist()))&&
            (this.length == otherSong.getLength())
        ){
            return true;
        }
        return false;
    }
}
