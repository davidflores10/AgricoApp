package com.example.bisite.agricoapp.Principal;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
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
