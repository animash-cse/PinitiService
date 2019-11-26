package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import bd.piniti.service.MehndiFirstFragment;


/**
 * Created by wolfsoft on 10/11/2015.
 */
public class MehndiPagerAdapter extends FragmentStatePagerAdapter {




    public MehndiPagerAdapter(FragmentManager fm) {
        super(fm);




    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                MehndiFirstFragment tab0 = new MehndiFirstFragment();
                return tab0;

            case 1:
                MehndiFirstFragment tab1 = new MehndiFirstFragment();
                return tab1;


            case 2:
                MehndiFirstFragment tab2 = new MehndiFirstFragment();
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