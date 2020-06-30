package com.zoli.MusicPlayer;

public class ShowActivity implements Activity {
    @Override
    public void activate(Writer writer, Song song) {
        writer.write(("Song title: " + song.getTitle()));
        writer.write(("Song length: " + song.getLength()));
    }
}
