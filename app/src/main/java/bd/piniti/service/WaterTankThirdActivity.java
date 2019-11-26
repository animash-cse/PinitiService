package bd.piniti.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import at.grabner.circleprogress.CircleProgressView;

public class WaterTankThirdActivity extends AppCompatActivity {


    TextView title, number, number1,type;
    ImageView back_img, search;
    Button button;
    int layout;

    LinearLayout linear_add,linear_count,bottom_linear,linear_add1,linear_count1,bottom_linear1;
    ImageView add,minus,add1,minus1;
    int count=1,adult=1;
    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_tank_third);




        type = findViewById(R.id.type);

        title = findViewById(R.id.title);


        Intent i=getIntent();
        layout = i.getIntExtra("layout",0);
        if(layout==1){
            title.setText("Water Tank");
            type.setText("Plumber");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("42"));
        }
        if(layout==2){
            title.setText("Full home Health Check");
            type.setText("Plumber");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("42"));
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
                Intent intent = new Intent(WaterTankThirdActivity.this,WaterTankFourthActivity.class);
                intent.putExtra("layout",layout);
                startActivity(intent);
            }
        });
    }
}
