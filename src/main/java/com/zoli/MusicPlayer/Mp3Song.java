package com.zoli.MusicPlayer;

public class Mp3Song extends Song{
    float size;
    int length;

    public Mp3Song(float size, int length) {
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
