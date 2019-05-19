package com.example.recyclerviewfeed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewfeed.R;
import com.example.recyclerviewfeed.pojos.SingleHorizontalGrounds;

import java.util.ArrayList;

public class SingleHGAdapter extends RecyclerView.Adapter<SingleHGAdapter.MyViewHolder> {

    ArrayList<SingleHorizontalGrounds> data = new ArrayList<>();

    public SingleHGAdapter(ArrayList<SingleHorizontalGrounds> data) {
        this.data = data;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_single_ground, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.imageGround.setImageResource(data.get(position).getImageGround());
        holder.title.setText(data.get(position).getgTitle());
        holder.status.setText(data.get(position).getgStatus());
        holder.sport.setText(data.get(position).getgSport());
        holder.location.setText(data.get(position).getgLocation());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, status, sport, location;
        ImageView imageGround;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageGround = (ImageView) itemView.findViewById(R.id.image_ground);
            title = (TextView) itemView.findViewById(R.id.title_ground);
            status = (TextView) itemView.findViewById(R.id.status_ground);
            sport = (TextView) itemView.findViewById(R.id.sport_ground);
            location = (TextView) itemView.findViewById(R.id.location_ground);
        }
    }
}
