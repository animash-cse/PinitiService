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

import Adapter.BookingRecycleAdapter;
import ModelClass.BookingModelClass;
import bd.piniti.service.R;


public class OnGoingFragment extends Fragment {


    private View view;


    private ArrayList<BookingModelClass> bookingModelClasses;
    private RecyclerView recyclerView;
    private BookingRecycleAdapter bAdapter;

    private String title[] = {"Salon at home for Women","Massage for Men"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_on_going, container, false);

        /*category recyclerview code is here*/

        recyclerView = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        bookingModelClasses = new ArrayList<>();

        for (int i = 0; i < title.length; i++) {
            BookingModelClass mycreditList = new BookingModelClass(title[i]);
            bookingModelClasses.add(mycreditList);
        }
        bAdapter = new BookingRecycleAdapter(getActivity(),bookingModelClasses);
        recyclerView.setAdapter(bAdapter);



        return  view;
    }


}
