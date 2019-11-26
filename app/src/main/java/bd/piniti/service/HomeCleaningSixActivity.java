package bd.piniti.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import at.grabner.circleprogress.CircleProgressView;

public class HomeCleaningSixActivity extends AppCompatActivity {

    TextView title,number,number1;
    ImageView back_img,search;
    CardView cardview;
    LinearLayout linear;

    int layout;
    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_cleaning_six);


        title = findViewById(R.id.title);

        Intent j=getIntent();
        layout = j.getIntExtra("layout",0);
        if(layout==1){

            title.setText("Select Payment Method");


            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("85"));
        }
        if(layout==2){

            title.setText("Select Payment Method");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("85"));
        }
        if(layout==3){

            title.setText("Select Payment Method");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("85"));
        }
        if(layout==4){

            title.setText("Select Payment Method");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("85"));
        }
        if(layout==5){

            title.setText("Select Payment Method");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("85"));
        }
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


                if (layout==1){
                    Intent intent = new Intent(HomeCleaningSixActivity.this,HomeCleaningSevenActivity.class);
                    intent.putExtra("layout",1);
                    startActivity(intent);
                }
                if (layout==2){
                    Intent intent = new Intent(HomeCleaningSixActivity.this,HomeCleaningSevenActivity.class);
                    intent.putExtra("layout",2);
                    startActivity(intent);
                }
                if (layout==3){
                    Intent intent = new Intent(HomeCleaningSixActivity.this,HomeCleaningSevenActivity.class);
                    intent.putExtra("layout",3);
                    startActivity(intent);
                }
                if (layout==4){
                    Intent intent = new Intent(HomeCleaningSixActivity.this,HomeCleaningSevenActivity.class);
                    intent.putExtra("layout",4);
                    startActivity(intent);
                }
                if (layout==5){
                    Intent intent = new Intent(HomeCleaningSixActivity.this,HomeCleaningSevenActivity.class);
                    intent.putExtra("layout",5);
                    startActivity(intent);
                }

            }
        });
    }
}
