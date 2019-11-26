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

import Adapter.ReviewRatingRecycleAdapter;
import ModelClass.HomeCategoryModelClass;
import at.grabner.circleprogress.CircleProgressView;

public class ReviewRatingActivity extends AppCompatActivity {

    ImageView back_img;
    TextView title;

    private ArrayList<HomeCategoryModelClass> homeCategoryModelClasses;
    private RecyclerView recyclerView;
    private ReviewRatingRecycleAdapter bAdapter;

    ImageView search;

    CircleProgressView circleProgressView;


    private  Integer image[] = {R.drawable.salon_at_home,R.drawable.salon_at_home,R.drawable.salon_at_home,R.drawable.salon_at_home,
            R.drawable.salon_at_home};
    private String title1[] = {"Very Nice Service!","Will Use it Again","Very Nice Service!","Will Use it Again","Very Nice Service!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_rating);

        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        title = findViewById(R.id.title);
        title.setText("Rating & Reviews");

        search = findViewById(R.id.search);
        search.setVisibility(View.GONE);

        circleProgressView = findViewById(R.id.circleView);
        circleProgressView.setVisibility(View.VISIBLE);
        circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
        circleProgressView.setTextSize(20);
        circleProgressView.setBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setValue(Float.parseFloat("20"));


          /*review rating recyclerview code is here*/

        recyclerView = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ReviewRatingActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeCategoryModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            HomeCategoryModelClass mycreditList = new HomeCategoryModelClass(image[i],title1[i]);
            homeCategoryModelClasses.add(mycreditList);
        }
        bAdapter = new ReviewRatingRecycleAdapter(ReviewRatingActivity.this,homeCategoryModelClasses);
        recyclerView.setAdapter(bAdapter);

    }
}
