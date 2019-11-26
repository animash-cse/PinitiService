package bd.piniti.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import at.grabner.circleprogress.CircleProgressView;

public class MehndiArtistBrideGuestNineActivity extends AppCompatActivity {

    TextView title,number,number1;
    ImageView back_img,search;
    CardView cardview;
    int layout;

    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mehndi_artist_bride_guest_nine);
        title = findViewById(R.id.title);

        Intent i=getIntent();
        layout=i.getIntExtra("layout",0);
        if(layout==1){
            title.setText("Salon at home for Women");
        }
        if(layout==2){
            title.setText("Attending Wedding, Party etc.");
        }if(layout==3){
            title.setText("Bridal Makeup Artist");
        }
        if(layout==4){
            title.setText("Mehendi Artist for Bride");
        }
        if(layout==11){
            title.setText("Mehendi Artist for Bride");
        }
        if(layout==22){
            title.setText("Mehendi Artist for Bride & Guests");
        }if(layout==33){
            title.setText("Mehendi Artist for Bride & Guests");
        }if(layout==44){
            title.setText("Mehendi Artist for Bride & Guests");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("100"));
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


    }
}
