package com.zoli.MusicPlayer.Activities;

import com.zoli.MusicPlayer.Activities.Activity;
import com.zoli.MusicPlayer.Player;

public class StartActivity implements Activity {
    Player player;

    public StartActivity(Player player) {
        this.player = player;
    }

    @Override
    public void activate() {
        player.getWriter().write("Start playing the current song: " + player.getCurrentSong().getTitle());
    }
}
