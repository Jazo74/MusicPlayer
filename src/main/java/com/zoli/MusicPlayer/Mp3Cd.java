package com.zoli.MusicPlayer;

public class Mp3Cd extends Cd {
    @Override
    public void addTrack(Song song) {
        songs.add(song);
    }
}
