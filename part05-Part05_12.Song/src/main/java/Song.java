
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        
        if (!(compare instanceof Song)) {
            return false;
        }
        
        Song compareSong = (Song) compare;
        
        if (durationInSeconds == compareSong.durationInSeconds &&
                artist.equals(compareSong.artist) &&
                name.equals(compareSong.name)) {
            return true;
        }
        
        return false;
    }


}
