package com.zoli.MusicPlayer;

import com.zoli.MusicPlayer.Activities.*;
import java.util.Scanner;

import java.util.ArrayList;

public class Menu {
    Scanner scan = new Scanner(System.in);
    ArrayList<MenuItem> items = new ArrayList<MenuItem>();
    ArrayList<Writer> writers = new ArrayList<Writer>();
    Player player;

    public Menu(Player player){
        this.player = player;
        items.add(new MenuItem("Start", new StartActivity(player)));
        items.add(new MenuItem("Stop", new StopActivity(player)));
        items.add(new MenuItem("Next", new NextActivity(player)));
        items.add(new MenuItem("Prev", new PrevActivity(player)));
        items.add(new MenuItem("Show", new ShowActivity(player)));
        items.add(new MenuItem("SetMode", new SetModeActivity(player)));
        items.add(new MenuItem("SetCD", new SetCDActivity(player)));
        items.add(new MenuItem("SetWriter", new SetWriterActivity(player)));
    }

    public void show(){

        while (true) {
            for (int i=0; i<items.size(); i++){
                System.out.println(i + ". " + items.get(i).title);
            }
            int choice = scan.nextInt();
            switch (choice){
                case 0:
                    player.start();
                    break;
                case 1:
                    player.stop();
                    break;
                case 2:
                    player.next();
                    break;
                case 3:
                    player.prev();
                    break;
                case 4:
                    player.show();
                    break;
                case 5:
                    for (int i=0; i<Player.PlayerMode.values().length; i++){
                        System.out.println(i + ". " + Player.PlayerMode.values()[i]);
                    }
                    while (true){
                        int subChoice = scan.nextInt();
                        if (subChoice >=0 && subChoice < Player.PlayerMode.values().length ){
                            player.setMode(Player.PlayerMode.values()[subChoice]);
                            break;
                        }
                    }
                    break;
                case 6:
                    if (player.Mode.equals(Player.PlayerMode.AudioCD)){
                        for (int i = 0; i < player.cdStorage.cdList.size(); i++){
                            System.out.println(i + ". " + player.cdStorage.cdList.get(i).title );
                        }
                        while (true){
                            int subChoice = scan.nextInt();
                            if (subChoice >=0 && subChoice < player.cdStorage.cdList.size() ){
                                player.currentCdIndex = subChoice;
                                player.setCd(player.cdStorage.cdList.get(subChoice));
                                break;
                            }
                        }
                    } else if (player.Mode.equals(Player.PlayerMode.MP3CD)){
                        for (int i = 0; i < player.cdStorage.mp3CdList.size(); i++){
                            System.out.println(i + ". " + player.cdStorage.mp3CdList.get(i).title );
                        }
                        while (true){
                            int subChoice = scan.nextInt();
                            if (subChoice >=0 && subChoice < player.cdStorage.mp3CdList.size() ){
                                player.currentCdIndex = subChoice;
                                player.setCd(player.cdStorage.mp3CdList.get(subChoice));
                                break;
                            }
                        }
                    } else {
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public MenuItem getMenuItemByTitle(String title) {
        for (MenuItem item : items) {
            if (item.title.equals(title)){
                return item;
            }
        }
        return null;
    }

    public void addItems(MenuItem item) {
        this.items.add(item);
    }  

    public void addWriters(Writer writer) {
        this.writers.add(writer);
    }

}
