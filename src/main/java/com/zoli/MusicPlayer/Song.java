package com.zoli.MusicPlayer;

public abstract class Song {
    String title;

    public String getTitle() {
        return title;
    }
    public abstract int getLength();
}
