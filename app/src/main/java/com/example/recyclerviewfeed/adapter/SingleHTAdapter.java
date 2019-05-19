package com.example.recyclerviewfeed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewfeed.R;
import com.example.recyclerviewfeed.pojos.SingleHorizontalTours;

import java.util.ArrayList;


public class SingleHTAdapter extends RecyclerView.Adapter<SingleHTAdapter.MyViewHolder> {

    ArrayList<SingleHorizontalTours> data = new ArrayList<>();

    public SingleHTAdapter(ArrayList<SingleHorizontalTours> data) {
        this.data = data;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_single_tour, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.imageTour.setImageResource(data.get(position).getImageTour());
        holder.title.setText(data.get(position).gettTitle());
        holder.status.setText(data.get(position).gettStatus());
        holder.sport.setText(data.get(position).gettSport());
        holder.location.setText(data.get(position).gettLocation());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, status, sport, location;
        ImageView imageTour;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageTour = (ImageView) itemView.findViewById(R.id.image_tour);
            title = (TextView) itemView.findViewById(R.id.title_tour);
            status = (TextView) itemView.findViewById(R.id.status_tour);
            sport = (TextView) itemView.findViewById(R.id.sport_tour);
            location = (TextView) itemView.findViewById(R.id.location_tour);
        }
    }
}
