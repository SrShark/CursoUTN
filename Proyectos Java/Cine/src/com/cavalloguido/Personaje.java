package com.cavalloguido;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombreEnPelicula;
    private Rol rol;
    private Actor actor;

    public Personaje(String nombreEnPelicula, Rol rol){
        this.nombreEnPelicula = nombreEnPelicula;
        this.rol = rol;
    }

    public Personaje(String nombreEnPelicula, Rol rol, Actor actor){
        this.nombreEnPelicula = nombreEnPelicula;
        this.rol = rol;
        this.actor = actor;
    }

    // TODO: terminar el metodo...
    public List<Personaje> buscarPersonajesSegunRoles(ArrayList<Personaje> listaPersonajeBusqueda, Rol rolReferencia)
    {
        System.out.println("Buscando Personajes de ROl: " + rolReferencia.getNombre());
        List<Personaje> listaPersonajeConRol = new ArrayList();
        for (Personaje personaje : listaPersonajeBusqueda)
        {
            if (personaje.getRol().getNombre().equals(rolReferencia.getNombre()))
            {
                listaPersonajeConRol.add(personaje);
                System.out.println(personaje.toString());
            }
        }
        return listaPersonajeConRol;
    }

    @Override
    public String toString() {
        System.out.printf("el actor %s protagonizo la pelicula %");
    }

    // GET AND SET
    public String getNombreEnPelicula() {
        return nombreEnPelicula;
    }

    public void setNombreEnPelicula(String nombreEnPelicula) {
        this.nombreEnPelicula = nombreEnPelicula;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
