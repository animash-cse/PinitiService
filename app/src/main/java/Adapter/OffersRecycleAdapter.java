package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClass.OffersModelClass;
import bd.piniti.service.R;


public class OffersRecycleAdapter extends RecyclerView.Adapter<OffersRecycleAdapter.MyViewHolder> {

    Context context;


    private List<OffersModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title;


        public MyViewHolder(View view) {
            super(view);


            title = (TextView) view.findViewById(R.id.title);


        }

    }


    public OffersRecycleAdapter(Context context, List<OffersModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public OffersRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_offers_list, parent, false);


        return new OffersRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final OffersModelClass lists = OfferList.get(position);

        holder.title.setText(lists.getTitle());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(context, All_Services_Activity.class);
//                context.startActivity(intent);
//            }
//        });


    }


    @Override
    public int getItemCount() {
        return OfferList.size();

    }

}


