package bd.piniti.service;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import Adapter.CategoryPagerAdapterAllServices;

public class All_Services_Activity extends AppCompatActivity {

    private TabLayout tabLayout;
    private int tab_value;
    ImageView back_img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__services_);

        back_img = findViewById(R.id.back_img);
        back_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        Intent intent = getIntent();
        tab_value = intent.getIntExtra("layout", 0);

        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.actionbar_color)); // Navigation bar the soft bottom of some phones like nexus and some Samsung note series
            getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.actionbar_color)); //status bar or the time bar at the top
        }


        tabLayout = (TabLayout) findViewById(R.id.tab_layout);


        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.addTab(tabLayout.newTab().setText("Beauty & Spa"));
        tabLayout.addTab(tabLayout.newTab().setText("Repair"));
        tabLayout.addTab(tabLayout.newTab().setText("Cleaning"));
        tabLayout.addTab(tabLayout.newTab().setText("Wedding & Events"));
        tabLayout.addTab(tabLayout.newTab().setText("Paintings"));
        tabLayout.addTab(tabLayout.newTab().setText("Pest Control"));
        tabLayout.addTab(tabLayout.newTab().setText("Pack & Shift"));
        tabLayout.addTab(tabLayout.newTab().setText("Plumber"));
        tabLayout.addTab(tabLayout.newTab().setText("Electrician"));
        tabLayout.addTab(tabLayout.newTab().setText("Tutor"));
        tabLayout.addTab(tabLayout.newTab().setText("Health"));
        tabLayout.addTab(tabLayout.newTab().setText("Farm & Agri"));
        tabLayout.addTab(tabLayout.newTab().setText("Home Services"));
        tabLayout.addTab(tabLayout.newTab().setText("Buy & Sell"));
        tabLayout.addTab(tabLayout.newTab().setText("Travel"));
        tabLayout.addTab(tabLayout.newTab().setText("Transportation"));
        tabLayout.addTab(tabLayout.newTab().setText("Rental"));
        tabLayout.addTab(tabLayout.newTab().setText("Shopping"));
        tabLayout.addTab(tabLayout.newTab().setText("Local Services"));
        tabLayout.addTab(tabLayout.newTab().setText("Laundry"));
        tabLayout.addTab(tabLayout.newTab().setText("Restaurant"));
        tabLayout.addTab(tabLayout.newTab().setText("Delivery"));
        tabLayout.addTab(tabLayout.newTab().setText("Professional Services"));
        tabLayout.addTab(tabLayout.newTab().setText("Devotional Services"));
        tabLayout.addTab(tabLayout.newTab().setText("Hotels"));
        tabLayout.addTab(tabLayout.newTab().setText("IT"));

//      Tablayout customefonts code is here.

        Typeface mTypeface = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf");
        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    ((TextView) tabViewChild).setTypeface(mTypeface, Typeface.NORMAL);
                }
            }
        }


        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        /*on tab viewpager change code is here*/

        final ViewPager viewPager1 = (ViewPager) findViewById(R.id.pager);
        CategoryPagerAdapterAllServices adapter = new CategoryPagerAdapterAllServices(getSupportFragmentManager(), 26);
        viewPager1.setAdapter(adapter);
        viewPager1.setOffscreenPageLimit(1);
        viewPager1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


//        tabLayout.getTabAt(tab_value);
        if (tab_value >= 0) {
            tabLayout.setScrollPosition(tab_value, 0f, true);
            viewPager1.setCurrentItem(tab_value);
        }
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager1.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }


}
