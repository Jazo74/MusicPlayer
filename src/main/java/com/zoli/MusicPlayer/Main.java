package com.zoli.MusicPlayer;

public class Main {

    public static void main(String[] args){
        Player player = new Player();
        Menu menu = new Menu(player);
        player.setMenu(menu);
        player.showMenu();
    }
}
