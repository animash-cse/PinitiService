package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ModelClass.BookingModelClass;
import bd.piniti.service.R;


public class BookingRecycleAdapter extends RecyclerView.Adapter<BookingRecycleAdapter.MyViewHolder> {

    Context context;

    boolean showingfirst = true;
    int myPos = 0;

    private List<BookingModelClass> OfferList;


    public class MyViewHolder extends RecyclerView.ViewHolder {



        TextView title;



        public MyViewHolder(View view) {
            super(view);


            title = (TextView) view.findViewById(R.id.title);



        }

    }


    public BookingRecycleAdapter(Context context, List<BookingModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public BookingRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_booking_list, parent, false);


        return new BookingRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final BookingModelClass lists = OfferList.get(position);

        holder.title.setText(lists.getTitle());







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


