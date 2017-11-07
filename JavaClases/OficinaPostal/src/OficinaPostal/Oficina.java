package OficinaPostal;

import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private Cartero cartero;
    private Paquete paquete;

    public Oficina(Paquete paquete, Cartero cartero) {
        this.cartero = cartero;
        this.paquete = paquete;
    }

    public List<Paquete> repartir(List<Paquete> paquetes, Cartero carteros){
        List<Paquete> paquetesSinRepartir = new ArrayList<Paquete>();

        for (Paquete paquete : paquetes) {
            if (paquete.getZona().getCodigoPostal() == carteros.getZona().getCodigoPostal()) {
                carteros.asignaPaquete(paquete);
            } else {
                paquetesSinRepartir.add(paquete);
            }
        }

        return paquetesSinRepartir;
    }

    public Cartero getCartero() {
        return cartero;
    }

    public void setCartero(Cartero cartero) {
        this.cartero = cartero;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }
}
