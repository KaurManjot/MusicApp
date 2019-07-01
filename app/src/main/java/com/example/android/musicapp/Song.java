package com.example.android.musicapp;

/*
    Represents a single song entry in CardView
 */
public class Song {

    private int image;
    private String title;
    private String singer;
    private String duration;

    Song(int image, String title, String singer, String duration) {
        this.image = image;
        this.title = title;
        this.singer = singer;
        this.duration = duration;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public String getDuration() {
        return duration;
    }
}
