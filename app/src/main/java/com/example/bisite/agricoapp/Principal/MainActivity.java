package com.example.bisite.agricoapp.Principal;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.bisite.agricoapp.R;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerEmpresas;
    EditText passwordText;
    Button btn_accept_Company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), AddNewCompany.class);
                startActivity(intent);
            }
        });


        spinnerEmpresas = (Spinner) findViewById(R.id.spinner);
        passwordText = (EditText) findViewById(R.id.editText);

        final String[] nombreEmpresas= {"Asociacion Pepito Pérez ","Asociación 2"};
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,  android.R.layout.simple_spinner_item, nombreEmpresas);

        spinnerEmpresas.setAdapter(spinnerArrayAdapter);

        btn_accept_Company=(Button) findViewById(R.id.AceptarSeleccionEmpresa);
        btn_accept_Company.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent intent=new Intent(getApplicationContext(), UserLogged.class);
                startActivity(intent);
            }
        });




    }

    /**
     * When the back button is pressed
     *
     * @param keyCode the code of the button pressed
     * @param event   the event of the button pressed
     * @return nothing
     */
    @Override
    /*-------------------------------------------------------------*/
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    /*-------------------------------------------------------------*/

        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    new AlertDialog.Builder(this, R.style.MyAlertDialogStyle)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .setTitle("Salir")
                            .setMessage("Cerrar")
                            .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                    System.exit(0);
                                }

                            })
                            .setNegativeButton("Cancelar", null)
                            .show();

                break;
            }

        }
        return true;
    }


}
