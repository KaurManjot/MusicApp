package com.example.android.musicapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/*
Adapter class takes the data and creates view for each item in RecyclerView
 */
public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    List<Song> songsList;
    Context context;

    public SongAdapter(List<Song> songsList) {
        this.songsList = songsList;
    }

    /*
    Inflate the layout that a RecyclerView will hold, then pass it to ViewHolder and return
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        context = parent.getContext();
        return viewHolder;
    }

    /*
    Gets the ViewHolder created in onCreateViewHolder() and set it on the song_item layout
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Song song = songsList.get(position);
        holder.imageAlbum.setImageResource(song.getImage());
        holder.title.setText(song.getTitle());
        holder.singer.setText(song.getSinger());
        holder.duration.setText(song.getDuration());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(context, context.getString(R.string.songAt) + (position + 1) + context.getString(R.string.isPlaying), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }
        });
    }

    /*
    Number if songs RecyclerView holds
     */
    @Override
    public int getItemCount() {
        return songsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageAlbum;
        TextView title;
        TextView singer;
        TextView duration;
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageAlbum = itemView.findViewById(R.id.img_album);
            title = itemView.findViewById(R.id.text_song_title);
            singer = itemView.findViewById(R.id.text_song_singer);
            duration = itemView.findViewById(R.id.text_song_duration);
            cardView = itemView.findViewById(R.id.card_view);
        }
    }
}
