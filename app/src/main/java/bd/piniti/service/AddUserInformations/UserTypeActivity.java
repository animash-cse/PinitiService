package bd.piniti.service.AddUserInformations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import bd.piniti.service.R;

public class UserTypeActivity extends AppCompatActivity {

    private RadioButton radioCustomer, radioProvider;

    // Declare Database for data fields
    private DatabaseReference databaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_type);

        radioCustomer = findViewById(R.id.radio_customer);
        radioProvider = findViewById(R.id.radio_provider);
        TextView previous = findViewById(R.id.type_previous);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        // Here get user id in currentFirebaseUser
        //  Declare firebase user for get user id
        FirebaseUser currentFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        // Set database location
        databaseUser = FirebaseDatabase.getInstance().getReference().child("Users").child(currentFirebaseUser.getUid());

        // Declare radio group
        RadioGroup rg = findViewById(R.id.user_type_Group);

        rg.setOnCheckedChangeListener((group, checkedId) -> {
            switch(checkedId){
                case R.id.radio_customer:
                    final String radiCustomer = radioCustomer.getText().toString();
                    databaseUser.child("user_type").setValue(radiCustomer);
                    break;
                case R.id.radio_provider:
                    final String radiProvider = radioProvider.getText().toString();
                    databaseUser.child("user_type").setValue(radiProvider);
                    break;
            }
        });
    }

    public void onClick(View view) {
        if(view.getId() == R.id.type_next) {
            Intent intent = new Intent(UserTypeActivity.this, GenderActivity.class);
            startActivity(intent);
        }
    }
}
