package com.example.recyclerviewfeed.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerviewfeed.HomeFragment;
import com.example.recyclerviewfeed.R;
import com.example.recyclerviewfeed.pojos.SingleHorizontalGrounds;
import com.example.recyclerviewfeed.pojos.SingleHorizontalMatches;
import com.example.recyclerviewfeed.pojos.SingleHorizontalTours;
import com.example.recyclerviewfeed.pojos.SingleVerticalPosts;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Object> items;
    private final int POST = 1;
    private final int HORIZONTAL_GROUND = 2;
    private final int HORIZONTAL_MATCH = 3;
    private final int HORIZONTAL_TOUR = 4;

    public MainAdapter(Context context, ArrayList<Object> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;
        RecyclerView.ViewHolder holder;
        switch (viewType) {
            case POST:
                view = inflater.inflate(R.layout.posts, parent, false);
                holder = new VPViewHolder(view);
                break;
            case HORIZONTAL_GROUND:
                view = inflater.inflate(R.layout.horizontal_grounds, parent, false);
                holder = new HGViewHolder(view);
                break;
            case HORIZONTAL_MATCH:
                view = inflater.inflate(R.layout.horizontal_matches, parent, false);
                holder = new HMViewHolder(view);
                break;
            case HORIZONTAL_TOUR:
                view = inflater.inflate(R.layout.horizontal_tours, parent, false);
                holder = new HTViewHolder(view);
                break;
            default:
                view = inflater.inflate(R.layout.horizontal_grounds, parent, false);
                holder = new HGViewHolder(view);
                break;
        }


        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder.getItemViewType() == POST)
            verticalView((VPViewHolder) holder);
        else if (holder.getItemViewType() == HORIZONTAL_GROUND)
            horizontalView((HGViewHolder) holder);
        else if (holder.getItemViewType() == HORIZONTAL_MATCH)
            horizontalView((HMViewHolder) holder);
        else if (holder.getItemViewType() == HORIZONTAL_TOUR)
            horizontalView((HTViewHolder) holder);
    }

    private void verticalView(VPViewHolder holder) {

        SingleVPAdapter adapter1 = new SingleVPAdapter(new HomeFragment().getVPData());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context));
        holder.recyclerView.setAdapter(adapter1);
    }


    private void horizontalView(HGViewHolder holder) {
        SingleHGAdapter adapter = new SingleHGAdapter(new HomeFragment().getHGData());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter);
    }

    private void horizontalView(HMViewHolder holder) {
        SingleHMAdapter adapter2 = new SingleHMAdapter(new HomeFragment().getHMData());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter2);
    }

    private void horizontalView(HTViewHolder holder) {
        SingleHTAdapter adapter = new SingleHTAdapter(new HomeFragment().getHTData());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter);
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof SingleVerticalPosts)
            return POST;
        if (items.get(position) instanceof SingleHorizontalGrounds)
            return HORIZONTAL_GROUND;
        if (items.get(position) instanceof SingleHorizontalMatches)
            return HORIZONTAL_MATCH;
        if (items.get(position) instanceof SingleHorizontalTours)
            return HORIZONTAL_TOUR;
        return -1;
    }

    public class HGViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;

        HGViewHolder(View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.ground_recyclerView);
        }
    }

    public class HMViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;

        HMViewHolder(View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.match_recyclerView);
        }
    }

    public class HTViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;

        HTViewHolder(View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.tour_recyclerView);
        }
    }

    public class VPViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;

        VPViewHolder(View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.post_recyclerView);
        }
    }

}
