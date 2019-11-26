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

import Adapter.AcSecondRecycleAdapter;
import ModelClass.AcSecondModelClass;
import at.grabner.circleprogress.CircleProgressView;

public class AcSecondActivity extends AppCompatActivity {

    TextView title, number, number1;
    ImageView back_img, search;
    Button button;


    /*Bridal data is here*/

    private ArrayList<AcSecondModelClass> acSecondModelClasses;
    private RecyclerView recyclerView1;
    private AcSecondRecycleAdapter Adapter;


    private String title2[] = {"Dry Service","Wet Service","Installation","Gas Refill","Uninstallation","Repair"};
    private String subtitle[] = {"$20","$30","$25","$20","$35"," Price on inspection"};

    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_second);

        circleProgressView = findViewById(R.id.circleView);
        circleProgressView.setVisibility(View.VISIBLE);
        circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
        circleProgressView.setTextSize(20);
        circleProgressView.setBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setValue(Float.parseFloat("25"));

        title = findViewById(R.id.title);
        title.setText("AC");

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
                Intent intent = new Intent(AcSecondActivity.this,AcThirdActivity.class);
                startActivity(intent);
            }
        });



         /* recyclerview code is here*/

        recyclerView1 = findViewById(R.id.recyclerview);

        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(AcSecondActivity.this);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        acSecondModelClasses = new ArrayList<>();

        for (int i = 0; i < title2.length; i++) {
            AcSecondModelClass mycreditList = new AcSecondModelClass(title2[i],subtitle[i]);
            acSecondModelClasses.add(mycreditList);
        }
        Adapter = new AcSecondRecycleAdapter(AcSecondActivity.this,acSecondModelClasses);
        recyclerView1.setAdapter(Adapter);
    }
}
