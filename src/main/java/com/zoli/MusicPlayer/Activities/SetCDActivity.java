package com.zoli.MusicPlayer.Activities;

import com.zoli.MusicPlayer.Activities.Activity;
import com.zoli.MusicPlayer.Player;
import com.zoli.MusicPlayer.Cd;

public class SetCDActivity implements Activity {
    Player player;

    public SetCDActivity(Player player) {
        this.player = player;
    }
    @Override
    public void activate() {
        player.getWriter().write("A new CD is in the player: " + player.getCurrentCd().getTitle());
    }

}
