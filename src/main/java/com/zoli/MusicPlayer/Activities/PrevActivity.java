package com.zoli.MusicPlayer.Activities;

import com.zoli.MusicPlayer.Activities.Activity;
import com.zoli.MusicPlayer.Player;

public class PrevActivity implements Activity {
    Player player;

    public PrevActivity(Player player) {
        this.player = player;
    }

    @Override
    public void activate() {
        int index = player.getCurrentSongIndex();
        if (index > 0){
            player.setCurrentSongIndex(index-1);
            player.setCurrentSong(player.getCurrentCd().getSong(index-1));
        } else {
            player.setCurrentSongIndex(player.getCurrentCd().getTracks().size()-1);
            player.setCurrentSong(player.getCurrentCd().getSong(player.getCurrentSongIndex()));
        }
        player.getWriter().write(("Stepping back to the previous song: " + player.getCurrentSong().getTitle()));
    }
}
