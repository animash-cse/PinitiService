package bd.piniti.service;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MehndiActivity extends AppCompatActivity {
    TextView title, number, number1;
    ImageView back_img, search;
    Button button;
    RadioButton radio1, radio2, radio3, radio4;
    private Object v;

    RadioGroup radiogroup;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mehndi);


        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        radio4 = findViewById(R.id.radio4);


        radiogroup = findViewById(R.id.radiogroup);

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                id = checkedId;
            }
        });


        title = findViewById(R.id.title);
        title.setText("Mehendi Artists");

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
                switch (id) {
                    case R.id.radio1:
                        Intent intent = new Intent(MehndiActivity.this,MehndiArtistOneActivity.class);

                        startActivity(intent);
                        break;

                    case R.id.radio2:
                        Intent intent1 = new Intent(MehndiActivity.this,MehndiArtistBrideActivity.class);
                        startActivity(intent1);

                        break;
                    case R.id.radio3:
                        break;
                    case R.id.radio4:
                        break;
                    default:
                        Toast.makeText(MehndiActivity.this, "Please select anyone item", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }


}
