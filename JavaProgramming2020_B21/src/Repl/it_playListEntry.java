package Repl;

public class it_playListEntry {

    public String title, artist;
    public int playCount = 0;

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int getPlayCount(){
        return playCount;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(String artist){
        this.artist=artist;
    }
    public void setPlayCount(int playCount){
        this.playCount=playCount;
    }

}
