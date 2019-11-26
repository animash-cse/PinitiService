package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import ModelClass.CategorySubModelClass;
import bd.piniti.service.R;


public class MehndiArtistGuestSixRecycleAdapter extends RecyclerView.Adapter<MehndiArtistGuestSixRecycleAdapter.MyViewHolder> {

    Context context;


    private List<CategorySubModelClass> OfferList;
    private int count = 1;


    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView title, number;
        LinearLayout linear_add, linear_count;
        ImageView minus, plus;


        public MyViewHolder(View view) {
            super(view);


            title = (TextView) view.findViewById(R.id.title);
            number = (TextView) view.findViewById(R.id.number);
            linear_add = (LinearLayout) view.findViewById(R.id.linear_add);
            linear_count = (LinearLayout) view.findViewById(R.id.linear_count);
            minus = (ImageView) view.findViewById(R.id.minus);
            plus = (ImageView) view.findViewById(R.id.plus);


        }

    }


    public MehndiArtistGuestSixRecycleAdapter(Context context, List<CategorySubModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public MehndiArtistGuestSixRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mehndi_artist_guest_six_list, parent, false);


        return new MehndiArtistGuestSixRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final CategorySubModelClass lists = OfferList.get(position);
        holder.title.setText(lists.getTitle());


//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, SalonAtHomeWomenTwo.class);
//                context.startActivity(intent);
//            }
//        });


        holder.linear_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.linear_count.setVisibility(View.VISIBLE);
                holder.linear_add.setVisibility(View.GONE);
                holder.number.setText(String.valueOf(count));
            }
        });

        holder.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                holder.number.setText(String.valueOf(count));
            }
        });
        holder.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                if (count >=0 )
                    holder.number.setText(String.valueOf(count));
                if(count==0){
                    holder.linear_count.setVisibility(View.GONE);
                    holder.linear_add.setVisibility(View.VISIBLE);
                    count=1;
                }
            }

        });

/*
        holder.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count= Integer.parseInt(String.valueOf(holder.number.getText()));
                count++;


                if (count==1){

                    holder.linear_add.setVisibility(View.GONE);
                    holder.linear_count.setVisibility(View.VISIBLE);

                }
                holder.number.setText(String.valueOf(count));
//                holder.minus.setVisibility(View.VISIBLE);
//                holder.number.setVisibility(View.VISIBLE);
            }

        });


        holder.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int count= Integer.parseInt(String.valueOf(holder.number.getText()));

                count--;
                if (count== 0){

                    holder.linear_add.setVisibility(View.VISIBLE);
                    holder.linear_count.setVisibility(View.GONE);

                }
                holder.number.setText(String.valueOf(count));

            }

        });*/


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


