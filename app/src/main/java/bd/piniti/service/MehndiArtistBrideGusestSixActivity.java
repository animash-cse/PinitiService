package bd.piniti.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.MehndiArtistGuestSixRecycleAdapter;
import ModelClass.CategorySubModelClass;
import at.grabner.circleprogress.CircleProgressView;

public class MehndiArtistBrideGusestSixActivity extends AppCompatActivity {

    TextView title,number,number1;
    ImageView back_img,search;
    LinearLayout linear;


    /*Bridal data is here*/

    private ArrayList<CategorySubModelClass> categorySubModelClasses;
    private RecyclerView recyclerView1;
    private MehndiArtistGuestSixRecycleAdapter Adapter;


    private String title2[] = {"Erica","Monika","Erica","Monika","Erica","Monika","Erica","Monika"};

    int layout;

    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mehndi_artist_bride_gusest_six);


        circleProgressView = findViewById(R.id.circleView);
        circleProgressView.setVisibility(View.VISIBLE);
        circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
        circleProgressView.setTextSize(20);
        circleProgressView.setBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setValue(Float.parseFloat("60"));

        title = findViewById(R.id.title);
        title.setText("Mehendi Artist for Bride & Guests");

        search = findViewById(R.id.search);
        search.setVisibility(View.GONE);

        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        linear = findViewById(R.id.linear);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MehndiArtistBrideGusestSixActivity.this,MehndiArtistFourth_OneActivity.class);
                intent.putExtra("layout",33);
                startActivity(intent);
            }
        });


         /*vertical category recyclerview code is here*/

        recyclerView1 = findViewById(R.id.recyclerview_bridle);

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(MehndiArtistBrideGusestSixActivity.this);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        categorySubModelClasses = new ArrayList<>();

        for (int i = 0; i < title2.length; i++) {
            CategorySubModelClass mycreditList = new CategorySubModelClass(title2[i]);
            categorySubModelClasses.add(mycreditList);
        }
        Adapter = new MehndiArtistGuestSixRecycleAdapter(MehndiArtistBrideGusestSixActivity.this,categorySubModelClasses);
        recyclerView1.setAdapter(Adapter);
    }
}
