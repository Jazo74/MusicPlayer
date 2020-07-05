package com.zoli.MusicPlayer;

public class Mp3Song extends Song{
    float size;
    int length;

    public Mp3Song(String title, float size, int length) {
        super.title = title;
        this.size = size;
        this.length = length;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }
}
