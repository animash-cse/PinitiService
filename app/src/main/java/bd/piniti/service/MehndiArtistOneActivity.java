package bd.piniti.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.MehndiArtistOneRecycleAdapter;
import ModelClass.MehndiArtistOneModelClass;
import at.grabner.circleprogress.CircleProgressView;

public class MehndiArtistOneActivity extends AppCompatActivity {

    TextView title,number,number1;
    ImageView back_img,search;

    Button button;
     /*Mehndi Artist data is here*/

    private ArrayList<MehndiArtistOneModelClass> mehndiArtistOneModelClasses;
    private RecyclerView recyclerView1;
    private MehndiArtistOneRecycleAdapter Adapter;


    private String title2[] = {"Traditional Design","Theme Design","Premium Finish Design"};
    private String subtitle[] = {"$15 to $20","$20 to $30","$50 to $70"};

    CircleProgressView circleProgressView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mehndi_artist_one);

        circleProgressView = findViewById(R.id.circleView);
        circleProgressView.setVisibility(View.VISIBLE);
        circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
        circleProgressView.setTextSize(20);
        circleProgressView.setBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setValue(Float.parseFloat("12"));

        title = findViewById(R.id.title);
        title.setText("Mehendi Artist for Bride");

        search = findViewById(R.id.search);
        search.setVisibility(View.GONE);

        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MehndiArtistOneActivity.this,MehndiArtistSecondActivity.class);
                intent.putExtra("layout",11);
                startActivity(intent);
            }
        });



        /*vertical category recyclerview code is here*/

        recyclerView1 = findViewById(R.id.recyclerview);

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(MehndiArtistOneActivity.this);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        mehndiArtistOneModelClasses = new ArrayList<>();

        for (int i = 0; i < title2.length; i++) {
            MehndiArtistOneModelClass mycreditList = new MehndiArtistOneModelClass(title2[i],subtitle[i]);
            mehndiArtistOneModelClasses.add(mycreditList);
        }
        Adapter = new MehndiArtistOneRecycleAdapter(MehndiArtistOneActivity.this,mehndiArtistOneModelClasses);
        recyclerView1.setAdapter(Adapter);
    }
}
