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

public class ToiletSanitaryWorkFourthActivity extends AppCompatActivity {

    TextView title, type,number,number1;
    ImageView back_img, search;
    Button button;

    LinearLayout linear_add,linear_count,bottom_linear,linear_add1,linear_count1,bottom_linear1;
    ImageView add,minus,add1,minus1;
    int count=1,adult=1;
    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet_sanitary_work_fourth);

        circleProgressView = findViewById(R.id.circleView);
        circleProgressView.setVisibility(View.VISIBLE);
        circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
        circleProgressView.setTextSize(20);
        circleProgressView.setBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setValue(Float.parseFloat("50"));



        type = findViewById(R.id.type);
        type.setText("Plumber");

        title = findViewById(R.id.title);
        title.setText("Toilet and Sanitary Work");

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
                Intent intent = new Intent(ToiletSanitaryWorkFourthActivity.this,ToiletSanitaryWorkFifthActivity.class);
                startActivity(intent);
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


        //linear_add1 = findViewById(R.id.linear_add1);
        linear_count1 = findViewById(R.id.linear_count1);
        add1 = findViewById(R.id.plus1);
        minus1 = findViewById(R.id.minus1);
        number1 = findViewById(R.id.number1);

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                number1.setText(String.valueOf(count));
            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count!=1){
                    count--;
                    number1.setText(String.valueOf(count));
                }
            }

        });

    }
}
