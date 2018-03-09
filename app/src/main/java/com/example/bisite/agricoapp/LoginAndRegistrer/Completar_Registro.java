package com.example.bisite.agricoapp.LoginAndRegistrer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bisite.agricoapp.R;

public class Completar_Registro extends AppCompatActivity {

    private EditText telefono, suelo, cantagua, hectareas, nsembradoras, ntractores, nremolques, nrecolectores, narados, nfumigadores, tiposemilla;
    private EditText ultimafertilizacion, ultimoinsecticida, cantfertilizante, cantinsecticida, prodhectarea, fechasiembra, fecharecogida, ultimoriego;
    private EditText semanaprep;
    private Button regis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completar__registro);

        telefono=(EditText)findViewById(R.id.telefono);
        suelo=(EditText)findViewById(R.id.suelo);
        cantagua=(EditText)findViewById(R.id.cantidad);
        hectareas=(EditText)findViewById(R.id.hectareas);
        nsembradoras=(EditText)findViewById(R.id.sembradoras);
        ntractores=(EditText)findViewById(R.id.tractores);
        nremolques=(EditText)findViewById(R.id.remolque);
        nrecolectores=(EditText)findViewById(R.id.recolectora);
        narados=(EditText)findViewById(R.id.arado);
        nfumigadores=(EditText)findViewById(R.id.fumigadora);
        tiposemilla=(EditText)findViewById(R.id.tiposemilla);
        ultimafertilizacion=(EditText)findViewById(R.id.ultimafertilizante);
        ultimoinsecticida=(EditText)findViewById(R.id.ultimainsecticida);
        cantfertilizante=(EditText)findViewById(R.id.cantfertilizante);
        cantinsecticida=(EditText)findViewById(R.id.cantinsecticida);
        prodhectarea=(EditText)findViewById(R.id.hectareas);
        fechasiembra=(EditText)findViewById(R.id.fechasiembra);
        fecharecogida=(EditText)findViewById(R.id.fecharecogida);
        ultimoriego=(EditText)findViewById(R.id.ultimoriego);
        semanaprep=(EditText)findViewById(R.id.semanapreparacion);

        regis=(Button)findViewById(R.id.enviar);


    }

    public boolean validar(){

        if(telefono.getText().length()==0||suelo.getText().length()==0||cantagua.getText().length()==0||hectareas.getText().length()==0||nsembradoras.getText().length()==0
                ||ntractores.getText().length()==0||ntractores.getText().length()==0||nremolques.getText().length()==0||nrecolectores.getText().length()==0
                ||narados.getText().length()==0||nfumigadores.getText().length()==0||tiposemilla.getText().length()==0||ultimafertilizacion.getText().length()==0
                ||ultimoinsecticida.getText().length()==0||cantfertilizante.getText().length()==0||cantinsecticida.getText().length()==0||prodhectarea.getText().length()==0
                ||fechasiembra.getText().length()==0||fecharecogida.getText().length()==0||ultimoriego.getText().length()==0||semanaprep.getText().length()==0)
        {
            Toast.makeText(getApplicationContext(), "No puedes dejar ningún campo vacío", Toast.LENGTH_LONG).show();
            return false;
        }
        else
        {
            return true;
        }

    }
}
