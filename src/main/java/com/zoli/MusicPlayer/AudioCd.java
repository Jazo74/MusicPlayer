package com.zoli.MusicPlayer;

public class AudioCd extends Cd {
    @Override
    public void addTrack(Song song) {
        songs.add(song);
    }
}
