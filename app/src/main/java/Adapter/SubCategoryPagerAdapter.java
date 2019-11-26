package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import bd.piniti.service.LegWaxingFragment;


/**
 * Created by wolfsoft on 10/11/2015.
 */
public class SubCategoryPagerAdapter extends FragmentStatePagerAdapter {




    public SubCategoryPagerAdapter(FragmentManager fm) {
        super(fm);




    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                LegWaxingFragment tab0 = new LegWaxingFragment();
                return tab0;

            case 1:
                LegWaxingFragment tab1 = new LegWaxingFragment();
                return tab1;


            case 2:
                LegWaxingFragment tab2 = new LegWaxingFragment();
                return tab2;



            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}