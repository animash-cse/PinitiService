package bd.piniti.service;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.OffersRecycleAdapter;
import ModelClass.OffersModelClass;
import at.grabner.circleprogress.CircleProgressView;

public class OffersActivity extends AppCompatActivity {

    TextView title,number,number1;
    ImageView back_img,search;


    private ArrayList<OffersModelClass> offersModelClasses;
    private RecyclerView recyclerView;
    private OffersRecycleAdapter bAdapter;

    private String title1[] = {"Get 10% off* ","Get 10% off* "};

    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);

        circleProgressView = findViewById(R.id.circleView);
        circleProgressView.setVisibility(View.VISIBLE);
        circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
        circleProgressView.setTextSize(20);
        circleProgressView.setBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setValue(Float.parseFloat("50"));

        title = findViewById(R.id.title);
        title.setText("Select Offer");

        search = findViewById(R.id.search);
        search.setVisibility(View.GONE);

        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


         /*offers recyclerview code is here*/

        recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(OffersActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        offersModelClasses = new ArrayList<>();

        for (int i = 0; i < title1.length; i++) {
            OffersModelClass mycreditList = new OffersModelClass(title1[i]);
            offersModelClasses.add(mycreditList);
        }
        bAdapter = new OffersRecycleAdapter(OffersActivity.this,offersModelClasses);
        recyclerView.setAdapter(bAdapter);
    }
}
