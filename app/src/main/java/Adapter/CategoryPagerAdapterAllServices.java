package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import fragment.ApplianceRepairFragment;
import fragment.BeautyFragment;
import fragment.ElectricianFragment;
import fragment.HomeCleaningFragment;
import fragment.MovingHomeFragment;
import fragment.PaintingFragment;
import fragment.PestControlFragment;
import fragment.PlumberFragment;
import fragment.TutorFragment;
import fragment.WeddingEventsFragment;


public class CategoryPagerAdapterAllServices extends FragmentPagerAdapter {

        int mNoOfTabs;

        public CategoryPagerAdapterAllServices(FragmentManager fm, int NumberOfTabs)

        {
                super(fm);
                this.mNoOfTabs = NumberOfTabs;
        }

        @Override
        public Fragment getItem(int position) {
                switch (position) {

                        case 0:
                                BeautyFragment tab1 = new BeautyFragment();
                                return tab1;
                        case 1:
                                ApplianceRepairFragment tab2 = new ApplianceRepairFragment();
                                return tab2;
                        case 2:
                                HomeCleaningFragment tab3 = new HomeCleaningFragment();
                                return tab3;

                        case 3:
                                WeddingEventsFragment tab4 = new WeddingEventsFragment();
                                return tab4;

                        case 4:
                                PaintingFragment tab5 = new PaintingFragment();
                                return tab5;

                        case 5:
                                PestControlFragment tab6 = new PestControlFragment();
                                return tab6;

                        case 6:
                                MovingHomeFragment tab7 = new MovingHomeFragment();
                                return tab7;

                        case 7:
                                PlumberFragment tab8 = new PlumberFragment();
                                return tab8;

                        case 8:
                                ElectricianFragment tab9 = new ElectricianFragment();
                                return tab9;
                        case 9:
                                TutorFragment tab10 = new TutorFragment();
                                return tab10;

                        default:
                                return null;

                }
        }

        @Override
        public int getCount() {
                return mNoOfTabs;

        }
}

