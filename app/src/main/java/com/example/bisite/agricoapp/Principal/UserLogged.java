package com.example.bisite.agricoapp.Principal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bisite.agricoapp.R;
import com.example.bisite.agricoapp.userInformation.UserInformation;

public class UserLogged extends AppCompatActivity {

    Button showUserInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_logged);

        showUserInformation=(Button)findViewById(R.id.button_logged);
        showUserInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),UserInformation.class);
                startActivity(intent);
            }
        });


    }
}
