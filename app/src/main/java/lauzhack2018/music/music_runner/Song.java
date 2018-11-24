package lauzhack2018.music.music_runner;

public class Song {
    long id;
    String title;
    int time; //in  seconds
    int value;
    String artist;
    //image??

    public Song (long id, String title, int time, int value, String artist) {
        this.id = id;
        this.title = title;
        this.time = time;
        this.value = value;
        this.artist = artist;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getTime() {
        return time;
    }

    public int getValue() {
        return value;
    }

    public String getArtist() {
        return artist;
    }


}
