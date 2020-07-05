package com.zoli.MusicPlayer.Activities;

import com.zoli.MusicPlayer.Player;

public class SetWriterActivity implements Activity {
    Player player;

    public SetWriterActivity(Player player) {
        this.player = player;
    }

    @Override
    public void activate() {
        player.getWriter().write(("Writer: " + player.getCurrentSong().getTitle()));
    }
}
