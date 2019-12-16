package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapter.HomeCategoryRecycleAdapter;
import ModelClass.HomeCategoryModelClass;
import bd.piniti.service.R;


public class HomeFragment extends Fragment {

    private  View view;

    private ArrayList<HomeCategoryModelClass> homeCategoryModelClasses;
    private RecyclerView recyclerView;
    private HomeCategoryRecycleAdapter bAdapter;


    private  Integer image[] = {R.drawable.ic_beauty,R.drawable.ic_appliance,R.drawable.ic_home_cleaning,R.drawable.ic_wedding,
                                R.drawable.ic_painting,R.drawable.ic_pest_control,R.drawable.ic_movinghome,R.drawable.ic_plumber,
                                R.drawable.ic_more_hori};
    private String title[] = {"Beauty & Spa","Appliance Repair","Home Cleaning","Weddings & Events","Paintings","Pest Control",
                              "Moving Homes","Plumber","More"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_home, container, false);



        /*category recyclerview code is here*/

        recyclerView = view.findViewById(R.id.CategoryRecyclerview);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(),3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeCategoryModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            HomeCategoryModelClass mycreditList = new HomeCategoryModelClass(image[i],title[i]);
            homeCategoryModelClasses.add(mycreditList);
        }
        bAdapter = new HomeCategoryRecycleAdapter(getActivity(),homeCategoryModelClasses);
        recyclerView.setAdapter(bAdapter);


        return  view;
    }


    }

