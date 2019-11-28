package bd.piniti.service.AddUserInformations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import bd.piniti.service.R;

public class GenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        RadioGroup rg = (RadioGroup) findViewById(R.id.gender);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radio_male:
                        // do operations specific to this selection
                        break;
                    case R.id.radio_female:
                        // do operations specific to this selection
                        break;
                    case R.id.radio_others:
                        // do operations specific to this selection
                        break;
                }
            }
        });
    }

    public void onClick(View view) {
        if(view.getId() == R.id.previous3) {
            onBackPressed();
        }
        if(view.getId() == R.id.next3) {
            uploadUserGender();
        }
    }

    private void uploadUserGender() {


    }
}
