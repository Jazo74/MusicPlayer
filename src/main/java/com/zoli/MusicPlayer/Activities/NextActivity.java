package com.zoli.MusicPlayer.Activities;

import com.zoli.MusicPlayer.Activities.Activity;
import com.zoli.MusicPlayer.Player;

public class NextActivity implements Activity {
    Player player;
    public NextActivity(Player player) {
        this.player = player;
    }

    @Override
    public void activate() {
        int index = player.getCurrentSongIndex();
        if ( index < player.getCurrentCd().getTracks().size()-1){
            player.setCurrentSongIndex(index+1);
            player.setCurrentSong(player.getCurrentCd().getSong(index+1));
        } else {
            player.setCurrentSongIndex(0);
            player.setCurrentSong(player.getCurrentCd().getSong(0));
        }
        player.getWriter().write(("Stepping to the next song: " + player.getCurrentSong().getTitle()));
    }
}
