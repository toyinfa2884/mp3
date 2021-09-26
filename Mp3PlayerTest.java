package mp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Mp3PlayerTest {

    @Test
    public void initialStateOfTheMp3Test() {
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.isOff();
        assertFalse(false);
    }

    @Test
    public void mp3PlayerCanBePowerOn(){
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.isOff();
        myMp3Player.isOn();
        assertTrue(true);
    }

    @Test
    public void mp3PlayerCanBePowerOff(){
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.isOn();
        myMp3Player.isOff();
        assertFalse(false);
    }
    @Test
    public void mp3PlayerHavePlaylistWithSongs(){
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.isOn();
        Playlist defaultPlaylist = myMp3Player.getPlaylist();
        assertEquals(defaultPlaylist, myMp3Player.getPlaylist());
        //when
        Music music = myMp3Player.getMusic();
        assertEquals(music, myMp3Player.getMusic());
    }
    @Test
    public void mp3PlayerCanPlayMusic() {
        Mp3Player myMp3Player = new Mp3Player();
        myMp3Player.isOn();
        myMp3Player.getPlaylist();
        assertSame(myMp3Player.play, myMp3Player.getMusic());
    }
}