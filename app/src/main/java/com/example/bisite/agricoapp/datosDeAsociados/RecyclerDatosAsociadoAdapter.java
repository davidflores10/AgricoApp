package com.example.bisite.agricoapp.datosDeAsociados;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bisite.agricoapp.R;

import java.util.List;

/**
 * Created by a on 09/03/2018.
 */

public class RecyclerDatosAsociadoAdapter extends RecyclerView.Adapter<RecyclerDatosAsociadoAdapter.DatosAsociadoViewHolder> {


    private int selectedPosition = 0;
    public static class DatosAsociadoViewHolder extends RecyclerView.ViewHolder {

        TextView producto;
        TextView cantidad;
        ImageView icono;
        RecyclerView recyclerView;

        public DatosAsociadoViewHolder(View itemView) {
            super(itemView);
            //cv = (CardView)itemView.findViewById(R.id.cv);
            producto = (TextView) itemView.findViewById(R.id.producto);
            cantidad = (TextView) itemView.findViewById(R.id.value);
            icono = (ImageView) itemView.findViewById(R.id.imageViewAsociado);



            recyclerView = (RecyclerView) itemView.findViewById(R.id.datosAsociadoRecycler);

            itemView.setClickable(true);
        }


    }

    List<Dato> datosList;

    RecyclerDatosAsociadoAdapter(List<Dato> datosL) {
        this.datosList = datosL;
    }

    @Override
    public DatosAsociadoViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        RecyclerDatosAsociadoAdapter.DatosAsociadoViewHolder languageViewHolder = new RecyclerDatosAsociadoAdapter.DatosAsociadoViewHolder(v);
        return languageViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerDatosAsociadoAdapter.DatosAsociadoViewHolder holder, final int position) {

        holder.producto.setText(datosList.get(position).getDato());
        holder.cantidad.setText(datosList.get(position).getCantidad());
        holder.icono.setImageResource(datosList.get(position).getIcono());



    }

    @Override
    public int getItemCount() {
        return datosList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }




}
