package bd.piniti.service;

import android.content.Intent;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.CategoryHorizontalRecycleAdapter;
import Adapter.CategorySubRecycleAdapter;
import ModelClass.CategorySubModelClass;
import ModelClass.HomeCategoryModelClass;
import at.grabner.circleprogress.CircleProgressView;

public class SalonAtHomeWomenOne extends AppCompatActivity {


    ImageView back_img,circle,search;
    TextView title;
    CardView CardReview;
    CircleProgressView circleProgressView;

    /*horizontal recyerview data is here*/

    private ArrayList<HomeCategoryModelClass> homeCategoryModelClasses;
    private RecyclerView recyclerView;
    private CategoryHorizontalRecycleAdapter bAdapter;

    private Integer image[] = {R.drawable.waxing,R.drawable.facial,R.drawable.pedicure,R.drawable.mehendi,R.drawable.threading};
    private String title1[] = {"Regular Waxing","Facial","Pedicure & Manicure","Mehndi","Threding"};


    /*subcategory data is here*/

    private  ArrayList<CategorySubModelClass>categorySubModelClasses;
    private RecyclerView recyclerView1;
    private CategorySubRecycleAdapter Adapter;


    private String title2[] = {"Half Arm Waxing","Leg Waxing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon_at_home_women_one);


        CardReview = findViewById(R.id.CardReview);
        CardReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SalonAtHomeWomenOne.this,ReviewRatingActivity.class);
                startActivity(intent);
            }
        });


        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.actionbar_color)); // Navigation bar the soft bottom of some phones like nexus and some Samsung note series
            getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.actionbar_color)); //status bar or the time bar at the top
        }


        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        title = findViewById(R.id.title);
        title.setText("Salon at home for women");

//        circle = findViewById(R.id.circle);
//        circle.setVisibility(View.GONE);

        circleProgressView = findViewById(R.id.circleView);
        circleProgressView.setVisibility(View.VISIBLE);
        circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
        circleProgressView.setTextSize(20);
        circleProgressView.setBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setValue(Float.parseFloat("10"));

        search = findViewById(R.id.search);
        search.setImageResource(R.drawable.ic_colorful_circle);



        /*horizontal category recyclerview code is here*/

        recyclerView = findViewById(R.id.recyclerview);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SalonAtHomeWomenOne.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        homeCategoryModelClasses = new ArrayList<>();

        for (int i = 0; i < image.length; i++) {
            HomeCategoryModelClass mycreditList = new HomeCategoryModelClass(image[i],title1[i]);
            homeCategoryModelClasses.add(mycreditList);
        }
        bAdapter = new CategoryHorizontalRecycleAdapter(SalonAtHomeWomenOne.this,homeCategoryModelClasses);
        recyclerView.setAdapter(bAdapter);




         /*vertical category recyclerview code is here*/

        recyclerView1 = findViewById(R.id.recyclerview_waxing);

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(SalonAtHomeWomenOne.this);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        categorySubModelClasses = new ArrayList<>();

        for (int i = 0; i < title2.length; i++) {
            CategorySubModelClass mycreditList = new CategorySubModelClass(title2[i]);
            categorySubModelClasses.add(mycreditList);
        }
        Adapter = new CategorySubRecycleAdapter(SalonAtHomeWomenOne.this,categorySubModelClasses);
        recyclerView1.setAdapter(Adapter);

    }
}
