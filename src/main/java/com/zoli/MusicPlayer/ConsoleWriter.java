package com.zoli.MusicPlayer;

public class ConsoleWriter extends Writer {
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
