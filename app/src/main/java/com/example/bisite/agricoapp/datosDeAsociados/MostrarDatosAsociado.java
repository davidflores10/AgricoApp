package com.example.bisite.agricoapp.datosDeAsociados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.bisite.agricoapp.R;

import java.util.ArrayList;
import java.util.List;

public class MostrarDatosAsociado extends AppCompatActivity {

    private List<Dato> ArrayDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos_asociado);

        //TODO hacer peticion a la base de datos

        ArrayDatos = initializeData();

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.datosAsociadoRecycler);
        recyclerView.setHasFixedSize(true);

        //Estableciendo el linear layout
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);




        //set the custom adapter
        RecyclerDatosAsociadoAdapter adapter = new RecyclerDatosAsociadoAdapter(ArrayDatos);
        recyclerView.setAdapter(adapter);

//Second parameter is layout orientation
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), 1);
        recyclerView.addItemDecoration(dividerItemDecoration);

    }


    /**
     * Create the rates list to show in the recyclerView
     *
     * @return
     */
    /*-------------------------------------------------------------*/
    private List<Dato> initializeData() {
    /*-------------------------------------------------------------*/

        List<Dato> ReturDatosList;
        ReturDatosList = new ArrayList<>();


        //añadimos los rates a la lista
        ReturDatosList.add(new Dato("Agua", "5000L", R.drawable.water));
        ReturDatosList.add(new Dato("Maquinaria", "3", R.drawable.tractor));
        ReturDatosList.add(new Dato("Suelo", "Arido", R.drawable.sprout));
        ReturDatosList.add(new Dato("Email", "p@p.com", R.drawable.email));
        ReturDatosList.add(new Dato("Siembra", "2/2/2018", R.drawable.ultimasiembra));

        return ReturDatosList;

    }


}
