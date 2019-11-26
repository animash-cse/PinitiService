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

public class HomeCleaningThreeActivity extends AppCompatActivity {

    TextView title,number,number1,type;
    ImageView back_img,search;


    ImageView add,add1,minus,minus1;
    LinearLayout linear_add,linear_add1,linear_count1,linear_count,bottom_linear;

    Button button;
    int count=1,adult=1;

    int layout;

    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_cleaning_three);

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
            circleProgressView.setValue(Float.parseFloat("42"));
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
            circleProgressView.setValue(Float.parseFloat("42"));
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
            circleProgressView.setValue(Float.parseFloat("42"));
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
            circleProgressView.setValue(Float.parseFloat("42"));
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


                if (layout==1){
                    Intent intent = new Intent(HomeCleaningThreeActivity.this,HomeCleaningFourthActivity.class);
                    intent.putExtra("layout",1);
                    startActivity(intent);
                }
                if (layout==2){
                    Intent intent = new Intent(HomeCleaningThreeActivity.this,HomeCleaningFourthActivity.class);
                    intent.putExtra("layout",2);
                    startActivity(intent);
                }
                if (layout==3){
                    Intent intent = new Intent(HomeCleaningThreeActivity.this,HomeCleaningFourthActivity.class);
                    intent.putExtra("layout",3);
                    startActivity(intent);
                }
                if (layout==4){
                    Intent intent = new Intent(HomeCleaningThreeActivity.this,HomeCleaningFourthActivity.class);
                    intent.putExtra("layout",4);
                    startActivity(intent);
                }
                if (layout==5){
                    Intent intent = new Intent(HomeCleaningThreeActivity.this,HomeCleaningFourthActivity.class);
                    intent.putExtra("layout",5);
                    startActivity(intent);
                }
            }
        });



        linear_add = findViewById(R.id.linear_add);
        linear_count = findViewById(R.id.linear_count);
        add = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        number = findViewById(R.id.number);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                number.setText(String.valueOf(count));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count!=1){
                    count--;
                    number.setText(String.valueOf(count));
                }

            }

        });
    }
}
