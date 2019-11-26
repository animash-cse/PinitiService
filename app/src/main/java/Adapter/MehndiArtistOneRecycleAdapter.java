package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

import ModelClass.MehndiArtistOneModelClass;
import bd.piniti.service.R;


public class MehndiArtistOneRecycleAdapter extends RecyclerView.Adapter<MehndiArtistOneRecycleAdapter.MyViewHolder> {

    Context context;


    private List<MehndiArtistOneModelClass> OfferList;

    int myPos = 0;



    public class MyViewHolder extends RecyclerView.ViewHolder {



        RadioButton title;
        TextView subtitle;


        public MyViewHolder(View view) {
            super(view);


            title = (RadioButton) view.findViewById(R.id.title);
            subtitle = (TextView) view.findViewById(R.id.subtitle);


        }

    }


    public MehndiArtistOneRecycleAdapter(Context context, List<MehndiArtistOneModelClass> offerList) {
        this.OfferList = offerList;
        this.context = context;
    }

    @Override
    public MehndiArtistOneRecycleAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mehndi_artist_list, parent, false);


        return new MehndiArtistOneRecycleAdapter.MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
        final MehndiArtistOneModelClass lists = OfferList.get(position);

        holder.title.setText(lists.getTitle());
        holder.subtitle.setText(lists.getSubtitle());


        if (myPos == position){
            holder.title.setSelected(true);
        }else {

            holder.title.setSelected(false);
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


