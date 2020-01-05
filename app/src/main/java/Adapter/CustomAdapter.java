package Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import ModelClass.Team;
import bd.piniti.service.MakupAndHairActivity;
import bd.piniti.service.R;
import bd.piniti.service.SalonAtHomeWomenOne;


public class CustomAdapter extends BaseExpandableListAdapter {

    private Context c;
    private ArrayList<Team> team;
    private LayoutInflater inflater;
    private int groupPosition;

    public CustomAdapter(Context c, ArrayList<Team> team)
    {
        this.c=c;
        this.team=team;
        inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    //GET A SINGLE PLAYER
    @Override
    public Object getChild(int groupPos, int childPos) {
        // TODO Auto-generated method stub
        return team.get(groupPos).players.get(childPos);
    }

    //GET PLAYER ID
    @Override
    public long getChildId(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return 0;
    }

    //GET PLAYER ROW
    @Override
    public View getChildView(final int groupPos, final int childPos, boolean isLastChild, View convertView,
                             ViewGroup parent) {

        //ONLY INFLATER XML ROW LAYOUT IF ITS NOT PRESENT,OTHERWISE REUSE IT

        if(convertView==null)
        {
            convertView=inflater.inflate(R.layout.item_group_header, null);
        }

        //GET CHILD/PLAYER NAME
        String  child=(String) getChild(groupPos, childPos);

        //SET CHILD NAME
        TextView nameTv=(TextView) convertView.findViewById(R.id.textView1);
        ImageView img=(ImageView) convertView.findViewById(R.id.imageView1);



        nameTv.setText(child);

        //GET TEAM NAME
        String teamName= getGroup(groupPos).toString();
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (childPos==0){

                    Intent intent =new Intent(c,SalonAtHomeWomenOne.class);
                    c.startActivity(intent);

                }
                else if (childPos==1){

                    Intent intent =new Intent(c,MakupAndHairActivity.class);
                    c.startActivity(intent);
                }
            }
        });



        //ASSIGN IMAGES TO PLAYERS ACCORDING TO THEIR NAMES AN TEAMS
        if(teamName.equals("Salon at home for Women"))
        {

            if(child=="Regular Waxing")
            {
                img.setImageResource(R.drawable.waxing) ;
            }else if(child=="Facial")
            {
                img.setImageResource(R.drawable.facial) ;
            }else if(child=="Pedicure & Manicure")
            {
                img.setImageResource(R.drawable.pedicure)  ;
            }else if(child=="Hair")
            {
                img.setImageResource(R.drawable.pedicure)   ;
            }else if(child=="Threading")
            {
                img.setImageResource(R.drawable.threading)   ;
            }
        }




        return convertView;
    }

    //GET NUMBER OF PLAYERS
    @Override
    public int getChildrenCount(int groupPosw) {
        // TODO Auto-generated method stub
        return team.get(groupPosw).players.size();
    }

    //GET TEAM
    @Override
    public Object getGroup(int groupPos) {
        // TODO Auto-generated method stub
        return team.get(groupPos);
    }

    //GET NUMBER OF TEAMS
    @Override
    public int getGroupCount() {
        // TODO Auto-generated method stub
        return team.size();
    }

    //GET TEAM ID
    @Override
    public long getGroupId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    //GET TEAM ROW
    @Override
    public View getGroupView(final int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        //ONLY INFLATE XML TEAM ROW MODEL IF ITS NOT PRESENT,OTHERWISE REUSE IT




        if(convertView == null)
        {
            convertView=inflater.inflate(R.layout.team, null);
        }

//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (groupPosition==2){
//
//                    Intent intent =new Intent(c,MehndiActivity.class);
//                    c.startActivity(intent);
//
//                }
//
//            }
//        });

        //GET GROUP/TEAM ITEM
        Team t=(Team) getGroup(groupPosition);

        //SET GROUP NAME
        TextView nameTv=(TextView) convertView.findViewById(R.id.textView1);
        ImageView img=(ImageView) convertView.findViewById(R.id.imageView1);
        LinearLayout linear=convertView.findViewById(R.id.headerlayout);
        LinearLayout linear1=convertView.findViewById(R.id.linear);

        String name=t.Name;
        nameTv.setText(name);
        if (groupPosition==0){
            linear1.setVisibility(View.VISIBLE);
        }else if(groupPosition==1){
            linear1.setVisibility(View.VISIBLE);
        }

        //ASSIGN TEAM IMAGES ACCORDING TO TEAM NAME

        if(name=="Salon at home for Women")
        {
            img.setImageResource(R.drawable.salon_at_home);
        }else if(name=="Makeup & Hair Styling")
        {
            img.setImageResource(R.drawable.makeup);
        }

        //SET TEAM ROW BACKGROUND COLOR
        convertView.setBackgroundColor(Color.LTGRAY);
        ImageView arrow=convertView.findViewById(R.id.arrow);






        if(isExpanded){
            arrow.setImageResource(R.drawable.ic_up_arrow);
        }
        else
        {
            arrow.setImageResource(R.drawable.ic_down_arrow5);
        }





        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isChildSelectable(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return true;
    }


}
