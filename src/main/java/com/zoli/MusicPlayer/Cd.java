package com.zoli.MusicPlayer;

import java.util.ArrayList;

public abstract class Cd {
    String title;
    int limit;
    ArrayList<Song> songs;

    public String getTitle() {
        return title;
    }

    public ArrayList<Song> getTracks() {
        return songs;
    }

    public int getLimit() {
        return limit;
    }

    public abstract void addTrack(Song song);

    public Song getSong(int index) {
        return songs.get(index);
    }
}
