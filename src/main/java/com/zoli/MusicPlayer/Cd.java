package com.zoli.MusicPlayer;

import java.util.ArrayList;

public abstract class Cd {
    int limit;
    ArrayList<Song> songs;

    public ArrayList<Song> getTracks() {
        return songs;
    }

    public int getLimit() {
        return limit;
    }

    public abstract void addTrack(Song song);

}
