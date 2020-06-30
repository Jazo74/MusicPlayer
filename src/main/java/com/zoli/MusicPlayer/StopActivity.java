package com.zoli.MusicPlayer;

public class StopActivity implements Activity {
    @Override
    public void activate(Writer writer, Song song) {
        writer.write(("Stop playing the current song: " + song.title));
    }
}
