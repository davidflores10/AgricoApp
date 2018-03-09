package com.example.bisite.agricoapp.datosDeAsociados;

/**
 * Created by a on 09/03/2018.
 */

public class Dato {


    private String dato;
    private String cantidad;
    private int icono;

    public Dato(String valorDato,String valorCantidad,int idIcono){

        this.dato=valorDato;
        this.cantidad=valorCantidad;
        this.icono=idIcono;


    }



    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }







}
