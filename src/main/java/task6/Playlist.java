package task6;

import java.util.ArrayList;

public class Playlist implements IPlaylist {
    private ArrayList<ISong> songList;

    @Override
    public ArrayList<ISong> getSongList() {
        return null;
    }

    public void setSongList(ArrayList<ISong> songList) {
        this.songList = songList;
    }

    @Override
    public void addSong(ISong song) {
        if (songList == null) {
            songList = new ArrayList<>();
        }
        songList.add(song);
    }

    @Override
    public void playAllSongs() {
        for (ISong song : songList) {
            song.play();
        }
    }
}