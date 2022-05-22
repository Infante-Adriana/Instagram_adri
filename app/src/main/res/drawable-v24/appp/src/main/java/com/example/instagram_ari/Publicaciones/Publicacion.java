package com.example.instagram_ari.Publicaciones;

public class Publicacion {
    private String Nombre;
    private String Descripcion;
    private int imagenperfil;
    private int imagenpublicacion;

    public Publicacion(){}

    public Publicacion(String nombre, String descripcion, int imagenperfil, int imagenpublicacion) {
        Nombre = nombre;
        Descripcion = descripcion;
        this.imagenperfil = imagenperfil;
        this.imagenpublicacion = imagenpublicacion;
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

    public int getImagenperfil() {
        return imagenperfil;
    }

    public void setImagenperfil(int imagenperfil) {
        this.imagenperfil = imagenperfil;
    }

    public int getImagenpublicacion() {
        return imagenpublicacion;
    }

    public void setImagenpublicacion(int imagenpublicacion) {
        this.imagenpublicacion = imagenpublicacion;
    }
}
