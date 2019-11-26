package bd.piniti.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import at.grabner.circleprogress.CircleProgressView;

public class MehndiArtistThirdActivity extends AppCompatActivity {

    TextView title,number,number1;
    ImageView back_img,search;
    Button button;
    int layout;

    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mehndi_artist_third);

        title = findViewById(R.id.title);
      //  title.setText("Mehendi Artist for Bride");

        search = findViewById(R.id.search);
        search.setVisibility(View.GONE);


        Intent i=getIntent();
        layout = i.getIntExtra("layout",0);
        if(layout==11){
            title.setText("Mehendi Artist for Bride");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("35"));
        }
        if(layout==22){
            title.setText("Mehendi Artist for Bride & Guests");

            circleProgressView = findViewById(R.id.circleView);
            circleProgressView.setVisibility(View.VISIBLE);
            circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
            circleProgressView.setTextSize(20);
            circleProgressView.setBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
            circleProgressView.setValue(Float.parseFloat("50"));
        }

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

                if(layout==11){
                    Intent intent = new Intent(MehndiArtistThirdActivity.this,MehndiArtistFourthActivity.class);
                    intent.putExtra("layout",layout);
                    startActivity(intent);
                }
                if (layout==22){
                    Intent intent = new Intent(MehndiArtistThirdActivity.this,MehndiArtistBrideGusestSixActivity.class);
                    intent.putExtra("layout",layout);
                    startActivity(intent);

                }



            }
        });


    }
}
