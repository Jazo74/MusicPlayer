package com.zoli.MusicPlayer;

public class PlayActivity implements Activity {
    @Override
    public void activate(Writer writer, Song song) {
        writer.write(("Start playing the current song: " + song.title));
    }
}
