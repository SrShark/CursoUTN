package OficinaPostal;

public class Paquete {
    private int id;
    private float peso;
    private Zona zona;
    private TipoPaquete tipoPaquete;

    public Paquete(int id, float peso, Zona zona, TipoPaquete tipoPaquete) {
        this.id = id;
        this.peso = peso;
        this.zona = zona;
        this.tipoPaquete = tipoPaquete;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public OficinaPostal.TipoPaquete getTipoPaquete() {
        return TipoPaquete;
    }

    public void setTipoPaquete(OficinaPostal.TipoPaquete tipoPaquete) {
        TipoPaquete = tipoPaquete;
    }
}
