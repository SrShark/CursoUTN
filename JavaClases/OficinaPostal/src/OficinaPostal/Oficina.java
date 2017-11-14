package OficinaPostal;

import java.util.ArrayList;
import java.util.List;

public class Oficina {

    public List<Paquete> repartir(List<Paquete> listaPaquetes, List<Cartero> listaCarteros){
        List<Paquete> paquetesSinRepartir = new ArrayList<Paquete>();

        for (Cartero cartero : listaCarteros) {
            for (Paquete paquete : listaPaquetes) {
                if (cartero.getZona().getCodigoPostal() == paquete.getZona().getCodigoPostal()) {
                    cartero.asignaPaquete(paquete);
                } else {
                    paquetesSinRepartir.add(paquete);
                }
            }
        }

        return paquetesSinRepartir;
    }
}
