package OficinaPostal;

import java.util.ArrayList;
import java.util.List;

public class Cartero {
    private String nombre;
    private Zona zona;

    public Cartero(String nombre, Zona zona) {
        this.nombre = nombre;
        this.zona = zona;
    }

    public List<Paquete> asignaPaquete(Paquete paquete){
        List<Paquete> paquetesAsignados = new ArrayList<>();

        paquetesAsignados.add(paquete);

        return paquetesAsignados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
}
