package com.zoli.MusicPlayer.Activities;

import com.zoli.MusicPlayer.Activities.Activity;
import com.zoli.MusicPlayer.Player;

public class StopActivity implements Activity {
    Player player;

    public StopActivity(Player player) {
        this.player = player;
    }

    @Override
    public void activate() {
        player.getWriter().write(("Stop playing the current song: " + player.getCurrentSong().getTitle()));
    }
}
