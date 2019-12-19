package bd.piniti.service.AddUserInformations;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.ArrayList;

import Adapter.CategoryRecycleAdapter;
import ModelClass.HomeCategoryModelClass;
import bd.piniti.service.HomePageActivity;
import bd.piniti.service.LocationActivity;
import bd.piniti.service.R;
import fragment.BookingFragment;
import fragment.CategoryFragment;
import fragment.HomeFragment;
import fragment.ProfileFragment;

public class Categorys extends AppCompatActivity {
    FrameLayout frameLayout;

    LinearLayout linear, city_linear;
    TextView title;


    protected BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {

                case R.id.navigation_shop:

                    city_linear.setVisibility(View.VISIBLE);
                    title.setText("");
                    fragment = new HomeFragment();
                    loadFragment(fragment);
                    return true;

                case R.id.navigation_gifts:

                    city_linear.setVisibility(View.GONE);
                    title.setText("Favorite");
                    fragment = new CategoryFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_cart:

                    city_linear.setVisibility(View.GONE);
                    title.setText("My Booking");
                    fragment = new BookingFragment();
                    loadFragment(fragment);


                    return true;
                case R.id.navigation_profile:

                    city_linear.setVisibility(View.GONE);
                    title.setText("Profile");
                    fragment = new ProfileFragment();
                    loadFragment(fragment);


                    return true;
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorys);


        linear = findViewById(R.id.linear);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Categorys.this, LocationActivity.class);
                startActivity(intent);
            }
        });

        city_linear = findViewById(R.id.city_linear);
        title = findViewById(R.id.title);


        loadFragment(new CategoryFragment());


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        HomePageActivity.BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        BottomNavigationMenuView menuView = (BottomNavigationMenuView) bottomNavigationView.getChildAt(0);
        for (int i = 0; i < menuView.getChildCount(); i++) {
            final View iconView = menuView.getChildAt(i).findViewById(android.support.design.R.id.icon);
            final ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
            final DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            layoutParams.height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 18, displayMetrics);
            layoutParams.width = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 18, displayMetrics);
            iconView.setLayoutParams(layoutParams);


        }
    }


    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framelayout, fragment);
        transaction.commit();
    }


    public static class BottomNavigationViewHelper {
        @SuppressLint("RestrictedApi")
        public static void disableShiftMode(BottomNavigationView view) {
            BottomNavigationMenuView menuView = (BottomNavigationMenuView) view.getChildAt(0);
            try {
                Field shiftingMode = menuView.getClass().getDeclaredField("mShiftingMode");
                shiftingMode.setAccessible(true);
                shiftingMode.setBoolean(menuView, false);
                shiftingMode.setAccessible(false);
                for (int i = 0; i < menuView.getChildCount(); i++) {
                    BottomNavigationItemView item = (BottomNavigationItemView) menuView.getChildAt(i);
                    //noinspection RestrictedApi
                    // item.setShiftingMode(false);
                    item.setShifting(false);
                    // set once again checked value, so view will be updated
                    //noinspection RestrictedApi
                    item.setChecked(item.getItemData().isChecked());
                }
            } catch (NoSuchFieldException e) {
                Log.e("BNVHelper", "Unable to get shift mode field", e);
            } catch (IllegalAccessException e) {
                Log.e("BNVHelper", "Unable to change value of shift mode", e);
            }
        }


    }
}
