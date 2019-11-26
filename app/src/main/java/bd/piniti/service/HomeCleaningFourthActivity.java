package bd.piniti.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import at.grabner.circleprogress.CircleProgressView;

public class HomeCleaningFourthActivity extends AppCompatActivity {


    TextView title, number, number1,type;
    ImageView back_img, search;
    Button button;

    int layout;
    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_cleaning_fourth);

        type = findViewById(R.id.type);
        title = findViewById(R.id.title);

        Intent i=getIntent();
        layout = i.getIntExtra("layout",0);
        if(layout==1){

            type.setText("Home Cleaning");
            title.setText("Home Deep Cleaning");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("56"));
        }
        if(layout==2){
            type.setText("Home Cleaning");
            title.setText("Kitchen Deep Cleaning");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("56"));
        }
        if(layout==3){
            type.setText("Home Cleaning");
            title.setText("Carpet Cleaning");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("56"));
        }
        if(layout==4){
            type.setText("Home Cleaning");
            title.setText("Bathroom Cleaning");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("56"));
        }
        if(layout==5){
            type.setText("Home Cleaning");
            title.setText("Sofa Cleaning");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("56"));
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

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (layout==1){
                    Intent intent = new Intent(HomeCleaningFourthActivity.this,HomeCleaningFifthActivity.class);
                    intent.putExtra("layout",1);
                    startActivity(intent);
                }
                if (layout==2){
                    Intent intent = new Intent(HomeCleaningFourthActivity.this,HomeCleaningFifthActivity.class);
                    intent.putExtra("layout",2);
                    startActivity(intent);
                }
                if (layout==3){
                    Intent intent = new Intent(HomeCleaningFourthActivity.this,HomeCleaningFifthActivity.class);
                    intent.putExtra("layout",3);
                    startActivity(intent);
                }
                if (layout==4){
                    Intent intent = new Intent(HomeCleaningFourthActivity.this,HomeCleaningFifthActivity.class);
                    intent.putExtra("layout",4);
                    startActivity(intent);
                }
                if (layout==5){
                    Intent intent = new Intent(HomeCleaningFourthActivity.this,HomeCleaningFifthActivity.class);
                    intent.putExtra("layout",5);
                    startActivity(intent);
                }
            }
        });


    }
}
