package com.example.recyclerviewfeed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewfeed.R;
import com.example.recyclerviewfeed.pojos.SingleVerticalPosts;


import java.util.ArrayList;


public class SingleVPAdapter extends RecyclerView.Adapter<SingleVPAdapter.MyViewHolder> {
    private ArrayList<SingleVerticalPosts> data = new ArrayList<>();

    public SingleVPAdapter(ArrayList<SingleVerticalPosts> data) {
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_post, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.imageProfile.setImageResource(data.get(position).getImageProfile());
        holder.nameProfile.setText(data.get(position).getNameProfile());
        holder.timePost.setText(data.get(position).getTimePost());
        holder.descPost.setText(data.get(position).getDescPost());
        holder.imagePost.setImageResource(data.get(position).getImagePost());
        holder.likesPost.setText(data.get(position).getLikesPost());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageProfile, imagePost;
        TextView nameProfile, timePost, descPost, likesPost;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageProfile = (ImageView) itemView.findViewById(R.id.image_profile);
            nameProfile = (TextView) itemView.findViewById(R.id.name_profile);
            timePost = (TextView) itemView.findViewById(R.id.time_post);
            descPost = (TextView) itemView.findViewById(R.id.description_post);
            imagePost = (ImageView) itemView.findViewById(R.id.image_post);
            likesPost = (TextView) itemView.findViewById(R.id.likes_post);
        }
    }
}
