package com.example.bisite.agricoapp.LoginAndRegistrer;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.bisite.agricoapp.R;
import com.example.bisite.agricoapp.VolleySingleton;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Completar_Registro extends AppCompatActivity implements View.OnClickListener {

    private EditText telefono, suelo, cantagua, hectareas, nsembradoras, ntractores, nremolques, nrecolectores, narados, nfumigadores, tiposemilla;
    private EditText ultimafertilizacion, ultimoinsecticida, cantfertilizante, cantinsecticida, prodhectarea, fechasiembra, fecharecogida, ultimoriego;
    private EditText semanaprep;
    private Button regis;
    private String correousu, contrausu;

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

        correousu=getIntent().getExtras().getString("correo");
        contrausu=getIntent().getExtras().getString("contra");


        regis=(Button)findViewById(R.id.enviar);

        regis.setOnClickListener(this);

    }

    public void actualizarr() {

        // Obtener valores actuales de los controles
        final String telef = telefono.getText().toString();
        final String suel = suelo.getText().toString();
        final String cantagu = cantagua.getText().toString();
        final String hectare = hectareas.getText().toString();
        final String sembrado = nsembradoras.getText().toString();
        final String tract = ntractores.getText().toString();
        final String remol = nremolques.getText().toString();
        final String recol = nrecolectores.getText().toString();
        final String arad = narados.getText().toString();
        final String fumigado = nfumigadores.getText().toString();
        final String tipsemi = tiposemilla.getText().toString();
        final String ultimafert = ultimafertilizacion.getText().toString();
        final String ultimainsec = ultimoinsecticida.getText().toString();
        final String cantfert = cantfertilizante.getText().toString();
        final String cantinsec = cantinsecticida.getText().toString();
        final String prodhect = prodhectarea.getText().toString();
        final String fechsiem = fechasiembra.getText().toString();
        final String fechrec = fecharecogida.getText().toString();
        final String ultrie = ultimoriego.getText().toString();
        final String semprep = semanaprep.getText().toString();



        HashMap<String, String> map = new HashMap<>();// Mapeo previo


        map.put("telefono", telef);
        map.put("suelo", suel);
        map.put("cantidadagua", cantagu);
        map.put("hectareas", hectare);
        map.put("sembradora", sembrado);
        map.put("tractor", tract);
        map.put("remolque", remol);
        map.put("recolectora", recol );
        map.put("arado", arad );
        map.put("fumigador", fumigado);
        map.put("tiposemilla", tipsemi );
        map.put("ultimafertilizantes", ultimafert );
        map.put("ultimainsecticida", ultimainsec );
        map.put("cantfertilizante", cantfert);
        map.put("cantinsecticida", cantinsec);
        map.put("produccion_hectarea", prodhect);
        map.put("fecha_siembra", fechsiem );
        map.put("fecha_recogida", fechrec );
        map.put("ultimoriego", ultrie);
        map.put("semana_preparacion", semprep);
        map.put("contra", contrausu);
        map.put("correo", correousu);


        // Crear nuevo objeto Json basado en el mapa
        JSONObject jobject = new JSONObject(map);



        // Actualizar datos en el servidor
        VolleySingleton.getInstance(getApplicationContext()).addToRequestQueue(
                new JsonObjectRequest(
                        Request.Method.POST,
                        "https://cgomezr.000webhostapp.com/actualizarusuario.php",
                        jobject,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                // Procesar la respuesta del servidor
                                procesarRespuestaActualizar(response);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                Toast.makeText(getApplicationContext().getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();

                            }
                        }

                ) {
                    @Override
                    public Map<String, String> getHeaders() {
                        Map<String, String> headers = new HashMap<String, String>();
                        headers.put("Content-Type", "application/json; charset=utf-8");
                        headers.put("Accept", "application/json");
                        return headers;
                    }

                    @Override
                    public String getBodyContentType() {
                        return "application/json; charset=utf-8" + getParamsEncoding();
                    }
                }
        );

    }


    private void procesarRespuestaActualizar(JSONObject response) {

        try {
            // Obtener estado
            String estado = response.getString("estado");

            switch (estado) {
                case "1":
                    // Mostrar mensaje
                    Toast.makeText(
                            getApplicationContext(),
                            "Datos insertados correctamente",
                            Toast.LENGTH_LONG).show();
                    // Terminar actividad
                   finish();
                    break;

                case "2":
                    // Mostrar mensaje
                    Toast.makeText(
                           getApplicationContext(),
                            "Error",
                            Toast.LENGTH_LONG).show();
                    // Terminar actividad
                   finish();
                    break;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

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

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.enviar:
                if(validar()){
                actualizarr();}

                break;
        }
    }
}
