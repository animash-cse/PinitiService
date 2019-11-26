package bd.piniti.service;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.WeddingRecycleAdapter;
import ModelClass.WeddingModelClass;

public class MakupAndHairActivity extends AppCompatActivity implements View.OnClickListener {

    TextView title,number,number1;
    ImageView back_img,search;


    LinearLayout linear1,linear2,linearmain1,linearmain2,bridallinear,weddinglinear;
    ImageView image1,image2;
    TextView title1,title2;
    Button button;


    int i=0;

    /*Wedding data is here*/

    private ArrayList<WeddingModelClass> weddingModelClasses;
    private RecyclerView recyclerView1;
    private WeddingRecycleAdapter Adapter;


 private String title3[] = {"Subtle makeup + Free Hairstyling","Detailed Makeup + Free Hairstyling","Only Hairstyling + Free Draping","Makeup & Hairstyling for Photoshoot"};
 private String txt1[] = {"-$30 per person","-$50 per person","-$20 per person","-$60 per person"};
 private String txt2[] = {"-Complete Professional Makeup","-Smokey eyes + Flase lashes","- Hair: straightening, Blow-dry,\n" +
         "  Curls, Buns, Braids","- Multiple looks for the entire shoot"};
 private String txt3[] = {"- Hair: straightening, Blow-dry,\n" +
         "  Curls, Buns, Braids","- Hair: straightening, Blow-dry,\n" +
         "  Curls, Buns, Braids","",""};
    private boolean selected1=true,selected2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makup_and_hair);

        title = findViewById(R.id.title);
        title.setText("Makeup & Hair Styling");

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

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MakupAndHairActivity.this,MakupAndHairFirstActivity.class);
//                startActivity(intent);
//            }
//        });



        linear1 = findViewById(R.id.linear1);
        linear2 = findViewById(R.id.linear2);
        linearmain1 = findViewById(R.id.linearmain1);
        linearmain2 = findViewById(R.id.linearmain2);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        title1 = findViewById(R.id.title1);
        title2 = findViewById(R.id.title2);
        bridallinear = findViewById(R.id.bridallinear);
        weddinglinear = findViewById(R.id.weddinglinear);


        linearmain1.setOnClickListener(this);
        linearmain2.setOnClickListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selected1==true)
                {
                    Intent intent = new Intent(MakupAndHairActivity.this,MakupAndHairFirstActivity.class);
                    startActivity(intent);

                }
                else if(selected2==true)
                {
                    Intent intent = new Intent(MakupAndHairActivity.this,WeddingPartyOneActivity.class);
                    startActivity(intent);

                }
            }
        });
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.linearmain1:

                linear1.setBackgroundResource(R.drawable.bridel_rect);
                title1.setTextColor(Color.parseColor("#38393f"));
                linear2.setBackgroundResource(R.drawable.light_bridel_rect);
                title2.setTextColor(Color.parseColor("#5a5b65"));
                bridallinear.setVisibility(View.VISIBLE);
                weddinglinear.setVisibility(View.GONE);
                selected1=true;


                break;

            case R.id.linearmain2:

                linear1.setBackgroundResource(R.drawable.light_bridel_rect);
                title1.setTextColor(Color.parseColor("#5a5b65"));
                linear2.setBackgroundResource(R.drawable.bridel_rect);
                title2.setTextColor(Color.parseColor("#38393f"));
                bridallinear.setVisibility(View.GONE);
                weddinglinear.setVisibility(View.VISIBLE);
                selected2=true;
                selected1=false;


                 /*vertical category recyclerview code is here*/

                recyclerView1 = findViewById(R.id.recyclerview);

                RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(MakupAndHairActivity.this);
                recyclerView1.setLayoutManager(layoutManager1);
                recyclerView1.setItemAnimator(new DefaultItemAnimator());

                weddingModelClasses = new ArrayList<>();

                for (int i = 0; i < title3.length; i++) {
                    WeddingModelClass mycreditList = new WeddingModelClass(title3[i],txt1[i],txt2[i],txt3[i]);
                    weddingModelClasses.add(mycreditList);
                }
                Adapter = new WeddingRecycleAdapter(MakupAndHairActivity.this,weddingModelClasses);
                recyclerView1.setAdapter(Adapter);

                break;

        }

    }
}
