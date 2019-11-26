package Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import ModelClass.WeddingModelClass;
import bd.piniti.service.R;


public class WeddingRecycleAdapter extends RecyclerView.Adapter<WeddingRecycleAdapter.MyViewHolder> {

    Context context;


    private List<WeddingModelClass> OfferList;

    int myPos = 0;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title,txt1,txt2,txt3;
        LinearLayout linear;


        public MyViewHolder(View view) {
            super(view);


            title = (TextView) view.findViewById(R.id.title);
            txt1 = (TextView) view.findViewById(R.id.txt1);
            txt2 = (TextView) view.findViewById(R.id.txt2);
            txt3 = (TextView) view.findViewById(R.id.txt3);
            linear = (LinearLayout) view.findViewById(R.id.linear);


        }

    }


    public WeddingRecycleAdapter(Context context, List<WeddingModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public WeddingRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_wedding_list, parent, false);


        return new WeddingRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final WeddingModelClass lists = OfferList.get(position);

        holder.title.setText(lists.getTitle());
        holder.txt1.setText(lists.getTxt1());
        holder.txt2.setText(lists.getTxt2());
        holder.txt3.setText(lists.getTxt3());


        if (position==0){

            holder.linear.setVisibility(View.VISIBLE);
        }else {

            holder.linear.setVisibility(View.GONE);
        }


        if (myPos == position){
            holder.title.setTextColor(Color.parseColor("#5a5b65"));

        }else {

            holder.title.setTextColor(Color.parseColor("#5a5b65"));

        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPos = position;
                notifyDataSetChanged();

            }
        });



    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


