package bd.piniti.service.AddUserInformations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;

import bd.piniti.service.R;

public class AddBirthdayActivity extends AppCompatActivity {
    private EditText day;
    private EditText month;
    private EditText year;

    // Declare Database for data fields
    private DatabaseReference databaseUser;

    // Declare Storage for images
    private StorageReference mStorage;

    //  Declare firebase user for get user id
    private FirebaseUser currentFirebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_user_birthday);

        day = findViewById(R.id.day);
        month = findViewById(R.id.month);
        year = findViewById(R.id.year);

        // Here get user id in currentFirebaseUser
        currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        // Set database location
        databaseUser = FirebaseDatabase.getInstance().getReference().child("Users").child(currentFirebaseUser.getUid());

    }

    public void onClick(View view) {
        if(view.getId() == R.id.previous2) {
            onBackPressed();
        }
        if(view.getId() == R.id.next2) {
            uploadUserBirth();
        }
    }

    private void uploadUserBirth() {

        final String uDay =  day.getText().toString().trim();
        final String uMonth = month.getText().toString().trim();
        final String uYear = year.getText().toString().trim();

        final String birthDay = uDay+"/"+uMonth+"/"+uYear;

        if(!TextUtils.isEmpty(uDay) && !TextUtils.isEmpty(uMonth) && !TextUtils.isEmpty(uYear) )
        {
            databaseUser.child("birthDay").setValue(birthDay);

            Toast.makeText(this, "Date of Birth Added", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(AddBirthdayActivity.this, GenderActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(AddBirthdayActivity.this, "Please fill up all the fields", Toast.LENGTH_SHORT).show();
        }
    }
}
