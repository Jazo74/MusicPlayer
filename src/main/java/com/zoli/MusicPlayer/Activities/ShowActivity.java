package com.zoli.MusicPlayer.Activities;

import com.zoli.MusicPlayer.Activities.Activity;
import com.zoli.MusicPlayer.AudioSong;
import com.zoli.MusicPlayer.Mp3Song;
import com.zoli.MusicPlayer.Player;

public class ShowActivity implements Activity {
    Player player;

    public ShowActivity(Player player) {
        this.player = player;
    }

    @Override
    public void activate() {
        if (player.getMode().equals(Player.PlayerMode.AudioCD)){
            AudioSong song = (AudioSong) player.getCurrentSong();
            player.getWriter().write("Song title: " + song.getTitle());
            player.getWriter().write("Song length: " + song.getLength() + " seconds"      );
            player.getWriter().write("Song sampling frequency: " + song.getSamplingFrequency() + " Hz");

        } else if (player.getMode().equals(Player.PlayerMode.MP3CD)){
            Mp3Song song = (Mp3Song) player.getCurrentSong();
            player.getWriter().write("Song title: " + song.getTitle());
            player.getWriter().write("Song length: " + song.getLength() + " seconds");
            player.getWriter().write("Song size: " + song.getSize() + "kByte");
        } else {

        }

    }
}
