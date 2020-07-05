package com.zoli.MusicPlayer;

public class Player {

    Menu menu;
    Writer writer;
    Cd currentCd;
    int currentCdIndex = -1;
    int currentSongIndex = -1;
    PlayerMode Mode = PlayerMode.AudioCD;
    Song currentSong;
    CdStorage cdStorage;

    public enum PlayerMode {
        AudioCD, MP3CD, Spotify
    }

    //Constructor
    public Player(){
        this.cdStorage = new CdStorage();
        writer = new ConsoleWriter();
        currentCd = new AudioCd("null",1);
        currentSong = new AudioSong("null",0,0);
        Mode = PlayerMode.AudioCD;
    }

    public void setCurrentCd(Cd currentCd) {
        this.currentCd = currentCd;
    }

    public void setCurrentCdIndex(int currentCdIndex) {
        this.currentCdIndex = currentCdIndex;
    }

    public void setCurrentSongIndex(int currentSongIndex) {
        this.currentSongIndex = currentSongIndex;
    }

    public void setCurrentSong(Song currentSong) {
        this.currentSong = currentSong;
    }

    public Writer getWriter() {
        return writer;
    }

    public Cd getCurrentCd() {
        return currentCd;
    }

    public int getCurrentCdIndex() {
        return currentCdIndex;
    }

    public int getCurrentSongIndex() {
        return currentSongIndex;
    }

    public Song getCurrentSong() {
        return currentSong;
    }

    public PlayerMode getMode() {
        return Mode;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void showMenu(){
        menu.show();
    }

    public void start(){
        if (!currentSong.getTitle().equals("null")){
            menu.getMenuItemByTitle("Start").activity.activate();
        } else {
            writer.write("There is no CD in the player");
        }
    }
    public void stop(){
        if (!currentSong.getTitle().equals("null")){
            menu.getMenuItemByTitle("Stop").activity.activate();
        } else {
            writer.write("There is no CD in the player");
        }
    }
    public void next(){
        if (!currentSong.getTitle().equals("null")){
            menu.getMenuItemByTitle("Next").activity.activate();
        } else {
            writer.write("There is no CD in the player");
        }
    }
    public void prev(){
        if (!currentSong.getTitle().equals("null")){
            menu.getMenuItemByTitle("Prev").activity.activate();
        } else {
            writer.write("There is no CD in the player");
        }
    }

    public void show(){
        if (!currentSong.getTitle().equals("null")){
            menu.getMenuItemByTitle("Show").activity.activate();
        } else {
            writer.write("There is no CD in the player");
        }
    }

    public void setWriter(Writer writer){
        this.writer = writer;
    }

    public void setCd(Cd cd){
        this.currentCd = cd;
        this.currentSong = this.currentCd.getSong(0);
        menu.getMenuItemByTitle("SetCD").activity.activate();
    }

    public void setMode(PlayerMode playerMode) {
        Mode = playerMode;
        menu.getMenuItemByTitle("SetMode").activity.activate();
    }

}