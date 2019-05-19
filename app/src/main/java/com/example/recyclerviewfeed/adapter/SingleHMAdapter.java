package com.example.recyclerviewfeed.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewfeed.R;
import com.example.recyclerviewfeed.pojos.SingleHorizontalMatches;

import java.util.ArrayList;


public class SingleHMAdapter extends RecyclerView.Adapter<SingleHMAdapter.MyViewHolder> {

    ArrayList<SingleHorizontalMatches> data = new ArrayList<>();

    public SingleHMAdapter(ArrayList<SingleHorizontalMatches> data) {
        this.data = data;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_single_match, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.imageMatch.setImageResource(data.get(position).getImageMatch());
        holder.imageTeam1.setImageResource(data.get(position).getImageTeam1());
        holder.imageTeam2.setImageResource(data.get(position).getImageTeam2());
        holder.nameMatch.setText(data.get(position).getNameMatch());
        holder.nameTeam1.setText(data.get(position).getNameTeam1());
        holder.nameTeam2.setText(data.get(position).getNameTeam2());
        holder.scoreTeam1.setText(data.get(position).getScoreTeam1());
        holder.scoreTeam2.setText(data.get(position).getScoreTeam2());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nameMatch, nameTeam1, nameTeam2, scoreTeam1, scoreTeam2;
        ImageView imageMatch, imageTeam1, imageTeam2;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageMatch = (ImageView) itemView.findViewById(R.id.image_match);
            imageTeam1 = (ImageView) itemView.findViewById(R.id.image_team1);
            imageTeam2 = (ImageView) itemView.findViewById(R.id.image_team2);
            nameMatch = (TextView) itemView.findViewById(R.id.name_match);
            nameTeam1 = (TextView) itemView.findViewById(R.id.name_team1);
            nameTeam2 = (TextView) itemView.findViewById(R.id.name_team2);
            scoreTeam1 = (TextView) itemView.findViewById(R.id.score_team1);
            scoreTeam2 = (TextView) itemView.findViewById(R.id.score_team2);
        }
    }
}
