package com.zoli.MusicPlayer;

import java.util.ArrayList;

public class CdStorage {
    ArrayList<Cd> cdList;
    ArrayList<Mp3Cd> mp3CdList;

    public CdStorage(){
        cdList = new ArrayList<Cd>();
        mp3CdList = new ArrayList<Mp3Cd>();

        AudioCd cdOne = new AudioCd("Rock1",10);
        cdOne.addTrack(new AudioSong("Spending my time", 44000, 279));
        cdOne.addTrack(new AudioSong("I don't wanna lose you", 44000, 256));
        cdOne.addTrack(new AudioSong("Right here waiting", 44000, 262));
        cdOne.addTrack(new AudioSong("Empty Rooms", 44000, 257));
        cdOne.addTrack(new AudioSong("All I care for", 44000, 188));
        cdOne.addTrack(new AudioSong("Carrie", 44000, 269));
        cdOne.addTrack(new AudioSong("Stairway to heaven", 44000, 339));
        cdOne.addTrack(new AudioSong("Flyin' high (Live version)", 44000, 282));
        cdList.add(cdOne);

        AudioCd cdTwo = new AudioCd("Rock2",8);
        cdTwo.addTrack(new AudioSong("Send me an angel", 44000, 274));
        cdTwo.addTrack(new AudioSong("It's over now", 44000, 250));
        cdTwo.addTrack(new AudioSong("Footprints in the snow", 44000, 230));
        cdTwo.addTrack(new AudioSong("Fall for me again", 44000, 252));
        cdTwo.addTrack(new AudioSong("Winds of change", 44000, 335));
        cdTwo.addTrack(new AudioSong("Victims of circumstance", 44000, 326));
        cdTwo.addTrack(new AudioSong("Only one woman", 44000, 201));
        cdTwo.addTrack(new AudioSong("Unchain my heart", 44000, 302));
        cdList.add(cdTwo);
    }
}
