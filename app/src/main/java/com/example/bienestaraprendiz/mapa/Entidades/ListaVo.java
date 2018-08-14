package com.example.bienestaraprendiz.mapa.Entidades;

import android.widget.ImageView;

public class ListaVo{
    String Nombre;
    String Descripcion;
    String Ubicacion;
    int Imagen;
    public ListaVo(String Nombre, String Descripcion,String Ubicacion,int imagen){
        this.Nombre=Nombre;
        this.Descripcion=Descripcion;
        this.Ubicacion=Ubicacion;
        this.Imagen= imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
