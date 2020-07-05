package com.zoli.MusicPlayer;

public class Mp3Cd extends Cd {

    public Mp3Cd(String title, int limit){
        super.title = title;
        super.limit = limit;
    }

    @Override
    public void addTrack(Song song) {
        if (super.limit <= super.songs.size()) {
            songs.add(song);
        }
    }

}
