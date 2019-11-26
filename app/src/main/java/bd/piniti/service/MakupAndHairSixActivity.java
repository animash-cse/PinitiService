package bd.piniti.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import at.grabner.circleprogress.CircleProgressView;

public class MakupAndHairSixActivity extends AppCompatActivity {
    TextView title,number,number1;
    ImageView back_img,search;

    LinearLayout linear_add,linear_add1,linear_count1,linear_count,bottom_linear;
    ImageView add,add1,minus,minus1;

    CardView CardViewOffer;
    Button ContinueButton;

    int count=1,adult=1;

    int layout;


    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makup_and_hair_six);






        title = findViewById(R.id.title);
//        title.setText("Bridal Makeup Artist");

        search = findViewById(R.id.search);
        search.setVisibility(View.GONE);

        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        Intent i=getIntent();
        layout = i.getIntExtra("layout",0);
        if(layout==3){
            title.setText("Bridal Makeup Artist");
            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("75"));
        }
        if(layout==4){
            title.setText("Mehendi Artist for Bride");
        }
        if(layout==11){
            title.setText("Mehendi Artist for Bride");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("75"));
        }
        if(layout==22){
            title.setText("Mehendi Artist for Bride & Guests");
        }if(layout==33){
            title.setText("Mehendi Artist for Bride & Guests");
        }



        ContinueButton = findViewById(R.id.ContinueButton);
        ContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MakupAndHairSixActivity.this,PaymentActivity.class);
                intent.putExtra("layout",layout);
                startActivity(intent);
            }
        });



        linear_add = findViewById(R.id.linear_add);
        linear_count = findViewById(R.id.linear_count);
        add = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        number = findViewById(R.id.number);

//        linear_add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                linear_add.setVisibility(View.GONE);
//                linear_count.setVisibility(View.VISIBLE);
//            }
//        });

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

//                if (count >=0 )
//                    number.setText(String.valueOf(count));
//                if(count==0){
//                    linear_count.setVisibility(View.GONE);
//                    linear_add.setVisibility(View.VISIBLE);
//                }
            }

        });
    }
}
