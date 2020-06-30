package com.zoli.MusicPlayer;

public class PrevActivity implements Activity {
    @Override
    public void activate(Writer writer, Song song) {
        writer.write(("Stepping back to the previous song: " + song.title));
    }
}
