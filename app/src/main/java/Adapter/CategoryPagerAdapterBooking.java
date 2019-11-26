package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import fragment.ApplianceRepairFragment;
import fragment.BeautyFragment;
import fragment.ElectricianFragment;
import fragment.HomeCleaningFragment;
import fragment.MovingHomeFragment;
import fragment.OnGoingFragment;
import fragment.PaintingFragment;
import fragment.PestControlFragment;
import fragment.PlumberFragment;
import fragment.WeddingEventsFragment;


/**
 * Created by wolfsoft5 on 7/4/18.
 */

public class CategoryPagerAdapterBooking extends FragmentPagerAdapter {

        int mNoOfTabs;

        public CategoryPagerAdapterBooking(FragmentManager fm, int NumberOfTabs)

        {
                super(fm);
                this.mNoOfTabs = NumberOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
                switch (position) {

                        case 0:
                                OnGoingFragment tab1 = new OnGoingFragment();
                                return tab1;
                        case 1:
                                OnGoingFragment tab2 = new OnGoingFragment();
                                return tab2;



                        default:
                                return null;

                }
        }

        @Override
        public int getCount() {
                return mNoOfTabs;

        }
}

