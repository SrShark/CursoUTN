package com.cavalloguido;

public class Actor {
    private String nombre;
    private String apellido;
    private boolean animado;
    private Sexo sexo; // Relación de Asociación

    public Actor(){
    }

    public Actor(String nombre, String apellido, boolean animado, Sexo sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.animado = animado;
        this.sexo = sexo;
    }

//    GETTERS AND SETTERS

    // Get Relación de Asociación
    public Sexo getSexo() {
        return sexo;
    }

    // Set Relación de Asociación
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public boolean isAnimado() {
        return animado;
    }

    public void setAnimado(boolean animado) {
        this.animado = animado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
