package com.example.bisite.agricoapp.userInformation;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bisite.agricoapp.R;

import java.util.List;

/**
 * Created by a on 09/03/2018.
 */

public class RecyclerUserInformationAdapter extends RecyclerView.Adapter<RecyclerUserInformationAdapter.UserInformationViewHolder> {
    private int selectedPosition = 0;
    public static class UserInformationViewHolder extends RecyclerView.ViewHolder {


        TextView lang;
        RecyclerView recyclerView;

        public UserInformationViewHolder(View itemView) {
            super(itemView);
            //cv = (CardView)itemView.findViewById(R.id.cv);
            lang = (TextView) itemView.findViewById(R.id.lang);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.userDataRecycler);

            itemView.setClickable(true);
        }


    }

    List<String> languagesList;

    RecyclerUserInformationAdapter(List<String> languages) {
        this.languagesList = languages;
    }

    @Override
    public UserInformationViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_recycler_item, viewGroup, false);
        UserInformationViewHolder languageViewHolder = new UserInformationViewHolder(v);
        return languageViewHolder;
    }

    @Override
    public void onBindViewHolder(UserInformationViewHolder holder, final int position) {

        holder.lang.setText(languagesList.get(position));



    }

    @Override
    public int getItemCount() {
        return languagesList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }


    /**
     * method for obtain the language
     * @param position
     * @return
     */
   public String getItem(int position){

        return languagesList.get(position);
    }




}
