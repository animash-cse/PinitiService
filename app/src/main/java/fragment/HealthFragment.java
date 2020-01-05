package fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.CustomAdapter;
import ModelClass.Team;
import bd.piniti.service.R;


public class HealthFragment extends Fragment {


    private View view;

    LinearLayout linear_Pharmacy, linear_ayurveda, linearHomeopathy;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_health, container, false);


        linear_Pharmacy = view.findViewById(R.id.linear_mehndi);
        linear_ayurveda = view.findViewById(R.id.linear_ayurveda);
        linearHomeopathy = view.findViewById(R.id.linear_Homeopathy);


        //THE EXPANDABLE
        ExpandableListView elv = (ExpandableListView) view.findViewById(R.id.expandblelistview);
        /*ExpandableListView elv2 = (ExpandableListView) view.findViewById(R.id.expandblelistview2);
        elv.setBackgroundColor(Color.WHITE);
        elv2.setBackgroundColor(Color.WHITE);*/


        final ArrayList<Team> team = getData();

        //CREATE AND BIND TO ADAPTER
        CustomAdapter adapter = new CustomAdapter(getActivity(), team);
        elv.setAdapter(adapter);
        elv.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                setListViewHeight(parent, groupPosition);
                return false;
            }
        });
        CustomAdapter adapter1 = new CustomAdapter(getActivity(), team);
       /* elv2.setAdapter(adapter1);
        elv2.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                setListViewHeight(parent, groupPosition);
                return false;
            }
        });*/

        //SET ONCLICK LISTENER
        elv.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPos,
                                        int childPos, long id) {

                Toast.makeText(getActivity().getApplicationContext(), team.get(groupPos).players.get(childPos), Toast.LENGTH_SHORT).show();

                return false;
            }
        });
        return view;
    }

    private void setListViewHeight(ExpandableListView listView, int groupPosition) {
        ExpandableListAdapter listAdapter = (ExpandableListAdapter) listView.getExpandableListAdapter();
        int totalHeight = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(),
                View.MeasureSpec.EXACTLY);
        for (int i = 0; i < listAdapter.getGroupCount(); i++) {
            View groupItem = listAdapter.getGroupView(i, false, null, listView);
            groupItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);

            totalHeight += groupItem.getMeasuredHeight();

            if (((listView.isGroupExpanded(i)) && (i != groupPosition))
                    || ((!listView.isGroupExpanded(i)) && (i == groupPosition))) {
                for (int j = 0; j < listAdapter.getChildrenCount(i); j++) {
                    View listItem = listAdapter.getChildView(i, j, false, null,
                            listView);
                    listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);

                    totalHeight += listItem.getMeasuredHeight();

                }
            }
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        int height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getGroupCount() - 1));
        if (height < 10)
            height = 200;
        params.height = height;
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    //ADD AND GET DATA

    private ArrayList<Team> getData() {

        Team t1 = new Team("Doctors");
        t1.players.add("Child Specialist");
        t1.players.add("Medicine");
        t1.players.add("Dentist");
        t1.players.add("Cardiologist");
        t1.players.add("Eye Specialist");
        t1.players.add("Kidney Specialist");
        t1.players.add("Psychiatrist");
        t1.players.add("Surgeons");
        t1.players.add("Ear Nose & Throat");
        t1.players.add("Neurology");
        t1.players.add("Gynecologist");
        t1.players.add("Internal Medicine");
        t1.players.add("Urology");
        t1.players.add("Dermatology");
        t1.players.add("Pediatric");



        Team t2 = new Team("Diagnostic Center");
        t2.players.add("Laboratory Testing");
        t2.players.add("Diagnostic Imaging");


        //  Team t3=new Team("Mehendi Artists");
//        t3.players.add("Regular Waxing");
//        t3.players.add("Facial");
//        t3.players.add("Pedicure & Manicure");
//        t3.players.add("Hair");
//        t3.players.add("Threading");

        ArrayList<Team> allTeams = new ArrayList<Team>();
        allTeams.add(t1);
        allTeams.add(t2);
        // allTeams.add(t3);

        return allTeams;

    }

    public boolean onChildClick(ExpandableListView parent, View v,
                                int groupPosition, int childPosition, long id) {

        v.setBackgroundColor(Color.BLUE);

        return false;
    }

}