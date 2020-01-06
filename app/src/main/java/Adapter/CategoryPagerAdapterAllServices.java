package Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import fragment.ApplianceRepairFragment;
import fragment.BeautyFragment;
import fragment.ElectricianFragment;
import fragment.HealthFragment;
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
                        case 10:
                                HealthFragment tab11 = new HealthFragment();
                                return tab11;
                        case 11:
                                ApplianceRepairFragment tab12 = new ApplianceRepairFragment();
                                return tab12;
                        case 12:
                                HomeCleaningFragment tab13 = new HomeCleaningFragment();
                                return tab13;

                        case 13:
                                WeddingEventsFragment tab14 = new WeddingEventsFragment();
                                return tab14;

                        case 14:
                                PaintingFragment tab15 = new PaintingFragment();
                                return tab15;

                        case 15:
                                PestControlFragment tab16 = new PestControlFragment();
                                return tab16;

                        case 16:
                                MovingHomeFragment tab17 = new MovingHomeFragment();
                                return tab17;

                        case 17:
                                PlumberFragment tab18 = new PlumberFragment();
                                return tab18;

                        case 18:
                                ElectricianFragment tab19 = new ElectricianFragment();
                                return tab19;
                        case 19:
                                TutorFragment tab20 = new TutorFragment();
                                return tab20;
                        case 20:
                                HealthFragment tab21 = new HealthFragment();
                                return tab21;
                        case 21:
                                ApplianceRepairFragment tab22 = new ApplianceRepairFragment();
                                return tab22;
                        case 22:
                                HomeCleaningFragment tab23 = new HomeCleaningFragment();
                                return tab23;

                        case 23:
                                WeddingEventsFragment tab24 = new WeddingEventsFragment();
                                return tab24;

                        case 24:
                                PaintingFragment tab25 = new PaintingFragment();
                                return tab25;

                        case 25:
                                PestControlFragment tab26 = new PestControlFragment();
                                return tab26;

                        case 26:
                                MovingHomeFragment tab27 = new MovingHomeFragment();
                                return tab27;

                        default:
                                return null;

                }
        }

        @Override
        public int getCount() {
                return mNoOfTabs;

        }
}

