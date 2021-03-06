package com.prueba.mascotas;

/**
 * Created by Intel on 23/12/2016.
 */

public class Mascota {

    private String nombre;
    private int foto;
    private int fotolike;
    private int megusta;

    public Mascota(int megusta, String nombre, int foto, int fotlike) {
        this.megusta = megusta;
        this.nombre = nombre;
        this.foto = foto;
        this.fotolike = fotolike;
    }

    public int getFotolike() {
        return fotolike;
    }

    public void setFotolike(int fotolike) {
        this.fotolike = fotolike;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getMegusta() {
        return megusta;
    }

    public void setMegusta(int megusta) {
        this.megusta = megusta;
    }
}
