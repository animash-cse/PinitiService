package bd.piniti.service;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import at.grabner.circleprogress.CircleProgressView;

public class HomePaintingEightActivity extends AppCompatActivity {

    CircleProgressView circleProgressView;
    TextView title,number,number1,type;
    ImageView search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_painting_eight);

        search = findViewById(R.id.search);
        search.setVisibility(View.GONE);

        type = findViewById(R.id.type);
        title = findViewById(R.id.title);

        type.setText("Painting");
        title.setText("Home Painitng");

        circleProgressView = findViewById(R.id.circleView);
        circleProgressView.setVisibility(View.VISIBLE);
        circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
        circleProgressView.setTextSize(20);
        circleProgressView.setBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setValue(Float.parseFloat("100"));
    }
}
