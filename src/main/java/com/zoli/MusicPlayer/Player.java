package com.zoli.MusicPlayer;

public class Player {

    String currentSong = new String();
    Menu menu = new Menu();
    public enum PlayerMode {
        AudioCD, MP3CD, Spotify
    }
    Writer writer;
    Cd cd;
    PlayerMode playerMode;

    public void showMenu(){
        menu.show();
    }

    public void start(){

    }
    public void stop(){

    }
    public void next(){

    }
    public void prev(){

    }

    public void show(){

    }

    public void setWriter(Writer writer){
        this.writer = writer;
    }

    public void setCd(Cd cd){
        this.cd = cd;
    }

    public void setMode(PlayerMode playerMode) {
        this.playerMode = playerMode;
    }



}