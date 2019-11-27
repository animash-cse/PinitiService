package bd.piniti.service;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.SelectCountryRecycleAdapter;
import ModelClass.SelectCountryModelClass;

public class LoginSignupActivity extends AppCompatActivity {

    Spinner spinner;
    Button button;
    Dialog slideDialog;
    LinearLayout sppiner;
    ImageView img;
    TextView txt;
    EditText editText;

    private ArrayList<SelectCountryModelClass> selectCountryModelClasses;
    private RecyclerView recyclerView;
    private SelectCountryRecycleAdapter bAdapter;

    private Integer image[] = {R.drawable.ic_bangladesh,R.drawable.ic_india,R.drawable.ic_america,R.drawable.ic_canada,
            R.drawable.ic_mexico,R.drawable.ic_australia,R.drawable.ic_brazil,
                               R.drawable.ic_russia};
    private String country_name[] = {"Bangladesh","India","US","Canada","Mexico","Australia","Brazil","Russia"};
    private String country_code[] = {"+880","+91","+1","+1","+52","+61","+91","+43"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.number_text);
        img = findViewById(R.id.image);
        txt = findViewById(R.id.country_code);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(LoginSignupActivity.this,OTPActivity.class);
                startActivity(intent);*/


                String code = txt.getText().toString().trim();

                String number = editText.getText().toString().trim();

                if (number.isEmpty() || number.length() < 10) {
                    editText.setError("Valid number is required");
                    editText.requestFocus();
                    return;
                }

                String phoneNumber = code + number;

                Intent intent = new Intent(LoginSignupActivity.this, OTPActivity.class);
                intent.putExtra("phonenumber", phoneNumber);
                startActivity(intent);
            }
        });


        sppiner = findViewById(R.id.sppiner);
        sppiner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slideDialog = new Dialog(LoginSignupActivity.this, R.style.CustomDialogAnimation);
                slideDialog.setContentView(R.layout.select_country_popup);


                slideDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                // Setting dialogview
                Window window = slideDialog.getWindow();
                //  window.setGravity(Gravity.BOTTOM);

                window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT);

                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                slideDialog.getWindow().getAttributes().windowAnimations = R.style.CustomDialogAnimation;
                layoutParams.copyFrom(slideDialog.getWindow().getAttributes());

                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.60);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.65);

                layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
                layoutParams.height = height;
                layoutParams.gravity = Gravity.BOTTOM;


                recyclerView = slideDialog.findViewById(R.id.recyclerview);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(LoginSignupActivity.this);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setItemAnimator(new DefaultItemAnimator());

                selectCountryModelClasses = new ArrayList<>();

                for (int i = 0; i < image.length; i++) {
                    SelectCountryModelClass mycreditList = new SelectCountryModelClass(image[i],country_name[i],country_code[i]);
                    selectCountryModelClasses.add(mycreditList);
                }
                bAdapter = new SelectCountryRecycleAdapter(LoginSignupActivity.this,selectCountryModelClasses);
                recyclerView.setAdapter(bAdapter);



                slideDialog.getWindow().setAttributes(layoutParams);
                slideDialog.setCancelable(true);
                slideDialog.setCanceledOnTouchOutside(true);
                slideDialog.show();
            }
        });



//
//        spinner = (Spinner)findViewById(R.id.spinner);
//
//        List<String> list = new ArrayList<String>();
//        list.add("+91 ");
//        list.add("+52 ");
//        list.add("+64");
//        list.add("+23");
//        list.add("+10");
//
//        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(LoginSignupActivity.this, R.layout.spinner_item, R.id.spinner_text, list);
//        spinner.setAdapter(dataAdapter);
    }

    public void selectedCountry(Integer image, String country_code) {
        img.setImageResource(image);
        txt.setText(country_code);

        slideDialog.dismiss();
    }
}
