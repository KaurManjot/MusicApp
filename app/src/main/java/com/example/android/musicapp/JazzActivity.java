package com.example.android.musicapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SongAdapter songAdapter;
    ArrayList<Song> songs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list_main);

        //Create dummy data for a song on Song object and add it to Songs ArrayList
        for (int i = 1; i <= 15; i++) {
            Song song = new Song(R.drawable.jazz, getResources().getString(R.string.song_title) +""+ i, getResources().getString(R.string.song_singer), getResources().getString(R.string.song_duration));
            songs.add(song);
        }

        songAdapter = new SongAdapter(songs);

        /*
        Get the RecyclerView in music_list_main xml file and set the LayoutManager and Adapter
         */
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(songAdapter);
    }
}
