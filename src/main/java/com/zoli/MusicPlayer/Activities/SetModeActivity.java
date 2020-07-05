package com.zoli.MusicPlayer.Activities;

import com.zoli.MusicPlayer.Activities.Activity;
import com.zoli.MusicPlayer.Player;

public class SetModeActivity implements Activity {
    Player player;

    public SetModeActivity(Player player) {
        this.player = player;
    }

    @Override
    public void activate() {
        player.getWriter().write(("New mode: " + player.getMode()));
    }
}
