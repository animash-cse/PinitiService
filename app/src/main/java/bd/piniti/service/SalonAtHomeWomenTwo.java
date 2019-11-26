package bd.piniti.service;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import Adapter.SubCategoryPagerAdapter;
import at.grabner.circleprogress.CircleProgressView;
import me.relex.circleindicator.CircleIndicator;

public class SalonAtHomeWomenTwo extends AppCompatActivity {

    TextView title,number;
    ImageView back_img,search;

    private ViewPager viewPager;

    private SubCategoryPagerAdapter subCategoryPagerAdapter;

    LinearLayout linear_add,linear_count,bottom_linear;
    ImageView add,minus;


    int count=1,adult=1;

    CircleProgressView circleProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon_at_home_women_two);


        circleProgressView = findViewById(R.id.circleView);
        circleProgressView.setVisibility(View.VISIBLE);
        circleProgressView.setOuterContourColor(getResources().getColor(R.color.blue));
        circleProgressView.setTextSize(20);
        circleProgressView.setBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setSpinBarColor(getResources().getColor(R.color.blue));
        circleProgressView.setValue(Float.parseFloat("30"));


        bottom_linear = findViewById(R.id.bottom_linear);
        bottom_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SalonAtHomeWomenTwo.this,SalonAtHomeWomenThree.class);
                startActivity(intent);
            }
        });

        linear_add = findViewById(R.id.linear_add);
        linear_count = findViewById(R.id.linear_count);
        add = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        number = findViewById(R.id.number);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                number.setText(String.valueOf(count));
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count!=1){
                    count--;
                    number.setText(String.valueOf(count));
                }
            }

        });


//        linear_add.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                linear_count.setVisibility(View.VISIBLE);
//                linear_add.setVisibility(View.GONE);
//                number.setText(String.valueOf(count));
//            }
//        });



        title = findViewById(R.id.title);
        title.setText("Salon at home for Women");

        search = findViewById(R.id.search);
        search.setVisibility(View.GONE);

        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);


         /*view pager and indicator code is here*/


        subCategoryPagerAdapter = new SubCategoryPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(subCategoryPagerAdapter);
        indicator.setViewPager(viewPager);
        subCategoryPagerAdapter.registerDataSetObserver(indicator.getDataSetObserver());


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }
}
