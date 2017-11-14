package OficinaPostal;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Oficina OficinaCentral = new Oficina();

        TipoPaquete encomienda = new TipoPaquete("encomienda");
        TipoPaquete contraReembolso = new TipoPaquete("contra-reembolso");
        TipoPaquete carta = new TipoPaquete("carta");

        Zona vm = new Zona("Villa Maria", 5900);
        Zona vn = new Zona("Villa Nueva", 5903);
        Zona cordoba = new Zona("Córdoba Capital", 5000);

        List<Cartero> listaCarteros = new ArrayList<Cartero>();
        listaCarteros.add(new Cartero("Guido", vm));
        listaCarteros.add(new Cartero("Lio", vn));
        listaCarteros.add(new Cartero("Ale", vm));
        listaCarteros.add(new Cartero("Nico", cordoba));

        List<Paquete> listaPaquetes = new ArrayList<Paquete>();
        listaPaquetes.add(new Paquete(1,(float)2.5,vm, encomienda));
        listaPaquetes.add(new Paquete(2,(float)3.4,vn, encomienda));
        listaPaquetes.add(new Paquete(3,(float)2.5,cordoba, encomienda));
        listaPaquetes.add(new Paquete(4,(float)2.5,vm, encomienda));
        listaPaquetes.add(new Paquete(5,(float)2.5,cordoba, encomienda));
        listaPaquetes.add(new Paquete(6,(float)2.5,vn, encomienda));
        listaPaquetes.add(new Paquete(7,(float)2.5,vn, encomienda));
        listaPaquetes.add(new Paquete(8,(float)2.5,cordoba, encomienda));
        listaPaquetes.add(new Paquete(9,(float)2.5,cordoba, encomienda));
        listaPaquetes.add(new Paquete(10,(float)2.5,vm, encomienda));

        OficinaCentral.repartir(listaPaquetes, listaCarteros);
    }
}
