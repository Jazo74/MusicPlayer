package com.zoli.MusicPlayer;

import com.zoli.MusicPlayer.Activities.Activity;

public class MenuItem {
    String title;
    Activity activity;

    public MenuItem(String title, Activity activity){
        this.title = title;
        this.activity = activity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
