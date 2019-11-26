package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

import Adapter.ProfileRecycleAdapter;
import ModelClass.HomeCategoryModelClass;
import bd.piniti.service.R;
import bd.piniti.service.SplashScreenActivity;


public class ProfileFragment extends Fragment {

    private View view;
    private TextView signOut;

    private ArrayList<HomeCategoryModelClass> homeCategoryModelClasses;
    private RecyclerView recyclerView;
    private ProfileRecycleAdapter bAdapter;

    private Integer image[] = {R.drawable.ic_notifications,R.drawable.ic_booking,R.drawable.ic_manage_address,R.drawable.ic_help,
    R.drawable.ic_rate_us,R.drawable.ic_share,R.drawable.ic_about,R.drawable.ic_t_and_c};
    private String title[] = {"Notification","My Bookings","Manage Address","Help","Rate us","Share App","About Rapid","Terms & Conditions"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_profile, container, false);


        /*category recyclerview code is here*/

        signOut = view.findViewById(R.id.log_out);
        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                getActivity().finish();
            }
        });


        recyclerView = view.findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeCategoryModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            HomeCategoryModelClass mycreditList = new HomeCategoryModelClass(image[i],title[i]);
            homeCategoryModelClasses.add(mycreditList);
        }
        bAdapter = new ProfileRecycleAdapter(getActivity(),homeCategoryModelClasses);
        recyclerView.setAdapter(bAdapter);


        return  view;
    }


}
