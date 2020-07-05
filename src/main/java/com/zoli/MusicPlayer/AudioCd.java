package com.zoli.MusicPlayer;

import java.util.ArrayList;

public class AudioCd extends Cd {

    public AudioCd(String title, int limit){
        super.title = title;
        super.songs = new ArrayList<Song>();
        super.limit = limit;
    }

    @Override
    public void addTrack(Song song) {
        if (super.limit >= super.songs.size()) {
            super.songs.add(song);
        }
    }
}
