package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapter.WeddingEventRecycleAdapter;
import ModelClass.HomeCategoryModelClass;
import bd.piniti.service.R;


public class WeddingEventsFragment extends Fragment {

    private View view;

    private ArrayList<HomeCategoryModelClass> homeCategoryModelClasses;
    private RecyclerView recyclerView;
    private WeddingEventRecycleAdapter bAdapter;


    private  Integer image[] = {R.drawable.party_decoration,R.drawable.wedding_photographer,R.drawable.event_photographer,
            R.drawable.makeup_and_hairstyling, R.drawable.mehendi_artists, R.drawable.party_decoration,R.drawable.wedding_photographer,R.drawable.event_photographer,
            R.drawable.makeup_and_hairstyling, R.drawable.mehendi_artists, R.drawable.party_decoration,R.drawable.wedding_photographer,R.drawable.event_photographer,
            R.drawable.makeup_and_hairstyling, R.drawable.mehendi_artists, R.drawable.party_decoration,R.drawable.wedding_photographer,R.drawable.event_photographer,
            R.drawable.makeup_and_hairstyling, R.drawable.mehendi_artists, R.drawable.makeup_and_hairstyling, R.drawable.mehendi_artists};
    private String title[] = {"Decoration","Wedding Photographer","Event Photographer","Makeup Artists","Hairstyling","Mehendi Artists","Venue","Catering","Band",
            "Transportation","Cards & Stationery","Favor & Gifts","Flowers","Lighting","Dress & Attire","Videographer","Jewelry","DJ","Ceremony Music","Officiant",
            "Event Rentals","Party Supplies"};



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_wedding_events, container, false);

         /*category recyclerview code is here*/

        recyclerView = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeCategoryModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            HomeCategoryModelClass mycreditList = new HomeCategoryModelClass(image[i],title[i]);
            homeCategoryModelClasses.add(mycreditList);
        }
        bAdapter = new WeddingEventRecycleAdapter(getActivity(),homeCategoryModelClasses);
        recyclerView.setAdapter(bAdapter);

        return  view;
    }

}
