package com.zoli.MusicPlayer;

import java.util.ArrayList;

public class Menu {

    ArrayList<MenuItem> items = new ArrayList<MenuItem>();
    ArrayList<Writer> writers = new ArrayList<Writer>();

    public void addItems(MenuItem item) {
        this.items.add(item);
    }

    public void addWriters(Writer writer) {
        this.writers.add(writer);
    }
    public void show(){

    }
}
