package bd.piniti.service;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import at.grabner.circleprogress.CircleProgressView;

public class AcOneActivity extends AppCompatActivity {
    TextView title, number, number1;
    ImageView back_img, search;
    RadioButton radio1, radio2, radio3, radio4;
    Button button;
    RadioGroup radiogroup;
    private int id;
    CircleProgressView circleProgressView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_one);

        circleProgressView = findViewById(R.id.circleView);


        circleProgressView.setVisibility(View.VISIBLE);
        circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
        circleProgressView.setTextSize(20);
        circleProgressView.setBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setValue(Float.parseFloat("12"));

        title = findViewById(R.id.title);
        title.setText("AC");

        search = findViewById(R.id.search);
        search.setVisibility(View.GONE);

        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        radiogroup = findViewById(R.id.radiogroup);

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                id = checkedId;
            }
        });

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (id) {
                    case R.id.radio1:
                        Intent intent = new Intent(AcOneActivity.this,AcSecondActivity.class);

                        startActivity(intent);
                        break;

                    case R.id.radio2:

                        break;


                    default:
                        Toast.makeText(AcOneActivity.this, "Please select anyone item", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
