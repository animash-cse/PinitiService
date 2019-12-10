package bd.piniti.service.AddUserInformations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import bd.piniti.service.R;

public class GenderActivity extends AppCompatActivity {

    // Declare Database for data fields
    private DatabaseReference databaseUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        RadioGroup rg = findViewById(R.id.gender);
        RadioButton male = findViewById(R.id.radio_male);
        RadioButton female = findViewById(R.id.radio_female);
        RadioButton others = findViewById(R.id.radio_others);

        //  Here get user id in currentFirebaseUser
        //  Declare firebase user for get user id
        FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        // Set database location
        databaseUser = FirebaseDatabase.getInstance().getReference().child("Users").child(currentFirebaseUser.getUid());


        rg.setOnCheckedChangeListener((group, checkedId) -> {
            switch(checkedId){
                case R.id.radio_male:
                    final String radimale = male.getText().toString();
                    databaseUser.child("user_gender").setValue(radimale);
                    break;
                case R.id.radio_female:
                    final String radifemale = female.getText().toString();
                    databaseUser.child("user_gender").setValue(radifemale);
                    break;
                case R.id.radio_others:
                    final String radiOthers = others.getText().toString();
                    databaseUser.child("user_gender").setValue(radiOthers);
                    break;
            }
        });
    }

    public void onClick(View view) {
        if(view.getId() == R.id.previous3) {
            onBackPressed();
        }
        if(view.getId() == R.id.next3) {
            Intent intent = new Intent(GenderActivity.this, AddBirthdayActivity.class);
            startActivity(intent);
        }
    }

}
