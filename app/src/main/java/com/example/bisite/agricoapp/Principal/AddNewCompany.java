package com.example.bisite.agricoapp.Principal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.bisite.agricoapp.R;

public class AddNewCompany extends AppCompatActivity {

    Button añadirNuevaCompañia;
    EditText nombreNuevaCompañia;
    EditText cifNuevaCompañia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_company);


        añadirNuevaCompañia= (Button ) findViewById(R.id.button);
        nombreNuevaCompañia= (EditText ) findViewById(R.id.editTextNombre);
        cifNuevaCompañia= (EditText ) findViewById(R.id.editTextCIF);

        //finish();

    }
}
