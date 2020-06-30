package com.zoli.MusicPlayer;

public class NextActivity implements Activity {
    @Override
    public void activate(Writer writer, Song song) {
        writer.write(("Stepping to the next song: " + song.title));
    }
}
