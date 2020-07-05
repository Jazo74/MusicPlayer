package com.zoli.MusicPlayer;

public class AudioSong extends Song{
    float samplingFrequency;
    int length;

    public AudioSong(String title, float samplingFrequency, int length) {
        super.title = title;
        this.samplingFrequency = samplingFrequency;
        this.length = length;
    }

    public float getSamplingFrequency() {
        return samplingFrequency;
    }

    public void setSamplingFrequency(float samplingFrequency) {
        this.samplingFrequency = samplingFrequency;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }
}
