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
                                MovingHomeFragment tab9 = new MovingHomeFragment();
                                return tab9;
                        case 9:
                                MovingHomeFragment tab10 = new MovingHomeFragment();
                                return tab10;
                        case 10:
                                MovingHomeFragment tab11 = new MovingHomeFragment();
                                return tab11;
                        case 11:
                                MovingHomeFragment tab12 = new MovingHomeFragment();
                                return tab12;
                        case 12:
                                ElectricianFragment tab13 = new ElectricianFragment();
                                return tab13;

                        case 13:
                                MovingHomeFragment tab14 = new MovingHomeFragment();
                                return tab14;

                        case 14:
                                MovingHomeFragment tab15 = new MovingHomeFragment();
                                return tab15;

                        case 15:
                                HealthFragment tab16 = new HealthFragment();
                                return tab16;

                        case 16:
                                MovingHomeFragment tab17 = new MovingHomeFragment();
                                return tab17;

                        case 17:
                                MovingHomeFragment tab18 = new MovingHomeFragment();
                                return tab18;

                        case 18:
                                MovingHomeFragment tab19 = new MovingHomeFragment();
                                return tab19;
                        case 19:
                                MovingHomeFragment tab20 = new MovingHomeFragment();
                                return tab20;
                        case 20:
                                MovingHomeFragment tab21 = new MovingHomeFragment();
                                return tab21;
                        case 21:
                                MovingHomeFragment tab22 = new MovingHomeFragment();
                                return tab22;
                        case 22:
                                MovingHomeFragment tab23 = new MovingHomeFragment();
                                return tab23;

                        case 23:
                                MovingHomeFragment tab24 = new MovingHomeFragment();
                                return tab24;

                        case 24:
                                MovingHomeFragment tab25 = new MovingHomeFragment();
                                return tab25;

                        case 25:
                                MovingHomeFragment tab26 = new MovingHomeFragment();
                                return tab26;

                        case 26:
                                MovingHomeFragment tab27 = new MovingHomeFragment();
                                return tab27;
                        case 27:
                                TutorFragment tab28 = new TutorFragment();
                                return tab28;

                        case 28:
                                WeddingEventsFragment tab29 = new WeddingEventsFragment();
                                return tab29;
                        default:
                                return null;

                }
        }

        @Override
        public int getCount() {
                return mNoOfTabs;

        }
}

