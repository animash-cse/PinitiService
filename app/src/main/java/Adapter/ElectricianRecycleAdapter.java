package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import ModelClass.HomeCategoryModelClass;
import bd.piniti.service.FanOneActivity;
import bd.piniti.service.FullHomeCheckElectricityOneActivity;
import bd.piniti.service.InverterOneActivity;
import bd.piniti.service.LightOneActivity;
import bd.piniti.service.R;


public class ElectricianRecycleAdapter extends RecyclerView.Adapter<ElectricianRecycleAdapter.MyViewHolder> {

    Context context;


    private List<HomeCategoryModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView title;
        LinearLayout linear;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            title = (TextView) view.findViewById(R.id.title);
            linear = (LinearLayout) view.findViewById(R.id.linear);


        }

    }


    public ElectricianRecycleAdapter(Context context, List<HomeCategoryModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public ElectricianRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_appliance_repair_list, parent, false);


        return new ElectricianRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final HomeCategoryModelClass lists = OfferList.get(position);
        holder.image.setImageResource(lists.getImage());
        holder.title.setText(lists.getTitle());

        if (position==3){

            holder.linear.setVisibility(View.GONE);
        }else {

            holder.linear.setVisibility(View.VISIBLE);

        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(position==0){
                    Intent intent = new Intent(context, FanOneActivity.class);
                    context.startActivity(intent);
                }else if(position==1){
                    Intent intent = new Intent(context, LightOneActivity.class);
                    context.startActivity(intent);
                }else if(position==2){
                    Intent intent = new Intent(context, InverterOneActivity.class);
                    context.startActivity(intent);
                }else if(position==3){
                    Intent intent = new Intent(context, FullHomeCheckElectricityOneActivity.class);
                    context.startActivity(intent);
                }




            }
        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


