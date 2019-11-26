package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.FirstImageFragment;


/**
 * Created by wolfsoft on 10/11/2015.
 */
public class BridalHairPagerAdapter extends FragmentStatePagerAdapter {




    public BridalHairPagerAdapter(FragmentManager fm) {
        super(fm);




    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FirstImageFragment tab0 = new FirstImageFragment();
                return tab0;

            case 1:
                FirstImageFragment tab1 = new FirstImageFragment();
                return tab1;


            case 2:
                FirstImageFragment tab2 = new FirstImageFragment();
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