package com.example.bisite.agricoapp.userInformation;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.example.bisite.agricoapp.R;

import java.util.ArrayList;

public class UserInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //productos
        ArrayList<String> productos = new ArrayList<>();
        productos.add("Asociado 1");
        productos.add("Asociado 2");
        productos.add("Asociado 3");


        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.userDataRecycler);
        recyclerView.setHasFixedSize(true);

        //Entablish a linear layout
        LinearLayoutManager llman = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llman);

        final RecyclerUserInformationAdapter adapter = new RecyclerUserInformationAdapter(productos);
        recyclerView.setAdapter(adapter);

        //if it is not a tablet separate the elements
        if (!esTablet(getApplicationContext())) {

            //Second parameter is layout orientation
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), 1);
            recyclerView.addItemDecoration(dividerItemDecoration);

        }

        /*int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animationController = AnimationUtils.loadLayoutAnimation(getApplicationContext(), resId);
        recyclerView.setLayoutAnimation(animationController);*/



    }



    /*-------------------------------------------------------------*/
    public static boolean esTablet(Context context) {
    /*-------------------------------------------------------------*/


        return (context.getResources().getConfiguration().screenLayout
                & Configuration.SCREENLAYOUT_SIZE_MASK)
                >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }




}
