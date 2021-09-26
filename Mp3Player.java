package mp3;

public class Mp3Player {


    public static Music play;
    private Playlist playlist;
    private Music music;

    public boolean isOff() {
        return false;
    }

    public boolean isOn() {
        return true;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public Music getMusic() {
        return music;
    }
}
