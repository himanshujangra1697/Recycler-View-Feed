package com.example.recyclerviewfeed;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerviewfeed.adapter.MainAdapter;
import com.example.recyclerviewfeed.pojos.SingleHorizontalGrounds;
import com.example.recyclerviewfeed.pojos.SingleHorizontalMatches;
import com.example.recyclerviewfeed.pojos.SingleHorizontalTours;
import com.example.recyclerviewfeed.pojos.SingleVerticalPosts;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private MainAdapter adapter;
    private ArrayList<Object> objects = new ArrayList<>();


    public HomeFragment() {
        // Required emp3ty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = (RecyclerView)v.findViewById(R.id.recycler_view);
        adapter = new MainAdapter(getContext(), getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




    }

    private ArrayList<Object> getObject() {
        objects.add(getHMData().get(0));
        objects.add(getVPData().get(0));
        objects.add(getHTData().get(0));
        objects.add(getVPData().get(1));
        objects.add(getHGData().get(0));
        objects.add(getVPData().get(2));
        return objects;
    }


    public static ArrayList<SingleHorizontalGrounds> getHGData() {
        ArrayList<SingleHorizontalGrounds> singleHorizontals = new ArrayList<>();
        singleHorizontals.add(new SingleHorizontalGrounds(R.drawable.ground, "ABC Ground", "Open", "Football", "New Delhi"));
        singleHorizontals.add(new SingleHorizontalGrounds(R.drawable.ground, "ABC Ground", "Open", "Football", "New Delhi"));
        singleHorizontals.add(new SingleHorizontalGrounds(R.drawable.ground, "ABC Ground", "Open", "Football", "New Delhi"));
        singleHorizontals.add(new SingleHorizontalGrounds(R.drawable.ground, "ABC Ground", "Open", "Football", "New Delhi"));
        return singleHorizontals;
    }

    public static ArrayList<SingleVerticalPosts> getVPData() {
        ArrayList<SingleVerticalPosts> singleVerticals = new ArrayList<>();
        singleVerticals.add(new SingleVerticalPosts(R.drawable.person, "Roots Premier League", "3 hrs ago", "Watch the inauguration of the Roots Premier League held at the\n" +
                "Marriott Hotel Complex in Andheri.", R.drawable.post1, "92"));
        singleVerticals.add(new SingleVerticalPosts(R.drawable.person, "Roots Premier League", "3 hrs ago", "Watch the inauguration of the Roots Premier League held at the\n" +
                "Marriott Hotel Complex in Andheri.", R.drawable.post2, "92"));
        singleVerticals.add(new SingleVerticalPosts(R.drawable.person, "Roots Premier League", "3 hrs ago", "Watch the inauguration of the Roots Premier League held at the\n" +
                "Marriott Hotel Complex in Andheri.", R.drawable.post3, "92"));
        return singleVerticals;
    }

    public static ArrayList<SingleHorizontalMatches> getHMData() {
        ArrayList<SingleHorizontalMatches> singleHorizontals = new ArrayList<>();
        singleHorizontals.add(new SingleHorizontalMatches(R.drawable.person, R.drawable.person, R.drawable.person, "Indian Premier League", "Delhi Daredevils", "Mumbai Indians", "2", "1"));
        singleHorizontals.add(new SingleHorizontalMatches(R.drawable.person, R.drawable.person, R.drawable.person, "Indian Premier League", "Delhi Daredevils", "Mumbai Indians", "2", "1"));
        singleHorizontals.add(new SingleHorizontalMatches(R.drawable.person, R.drawable.person, R.drawable.person, "Indian Premier League", "Delhi Daredevils", "Mumbai Indians", "2", "1"));
        singleHorizontals.add(new SingleHorizontalMatches(R.drawable.person, R.drawable.person, R.drawable.person, "Indian Premier League", "Delhi Daredevils", "Mumbai Indians", "2", "1"));
        return singleHorizontals;
    }

    public static ArrayList<SingleHorizontalTours> getHTData() {
        ArrayList<SingleHorizontalTours> singleHorizontals = new ArrayList<>();
        singleHorizontals.add(new SingleHorizontalTours(R.drawable.tour, "UEFA Europe League", "Ongoing", "Football", "New Delhi"));
        singleHorizontals.add(new SingleHorizontalTours(R.drawable.tour, "UEFA Europe League", "Ongoing", "Football", "New Delhi"));
        singleHorizontals.add(new SingleHorizontalTours(R.drawable.tour, "UEFA Europe League", "Ongoing", "Football", "New Delhi"));
        singleHorizontals.add(new SingleHorizontalTours(R.drawable.tour, "UEFA Europe League", "Ongoing", "Football", "New Delhi"));
        return singleHorizontals;
    }


}
