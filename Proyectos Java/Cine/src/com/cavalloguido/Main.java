package com.cavalloguido;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
//      TODO: Actor -> Sexo (Relación de Asosiación.)
////      Instanciamos el objeto sexo para definir el atributo.
//        Sexo sexo = new Sexo("mujer");
//
////      Pasamos el objeto completo como parametro al constructor del objeto Actor.
//        Actor actor = new Actor("juan", "perez", false, sexo);
//
////      podemos acceder al atributo mediante el getter.
//        System.out.println(actor.getSexo().getNombre());

//        TODO Pelicula -> PaisDeOrigen, Genero, Calificación
        Genero genero = new Genero();
        genero.setNombre("Comedia");

        Calificacion calificacion = new Calificacion();
        calificacion.setNombre("ATP");

        PaisDeOrigen pais = new PaisDeOrigen();
        pais.setNombre("Argentina");
        pais.setIdioma("Castellano");

//        // FORMA DE INSTANCIAR FECHAS
//        //FORMA 1
//        Calendar calendario = Calendar.getInstance();
//        calendario.set(Calendar.YEAR, 1988);
//        calendario.set(Calendar.MONTH, Calendar.JANUARY);
//        calendario.set(Calendar.DAY_OF_MONTH, 1);
//        //FORMA 2
//        Calendar calendario2 = new GregorianCalendar(1988, 0, 1, 20, 11, 44);
//        // ASIGNAR LA FECHA A UN OBJETO DATE.
//        Date fecha = calendario.getTime();
//        Date otraFecha = calendario2.getTime();

        // FECHAS PARA EL OBJETO PELICULA todoPoderoso.
        Calendar fecha1 = new GregorianCalendar(1988, 0, 1);
        Date AnioEstreno = fecha1.getTime();

        Calendar fecha2 = new GregorianCalendar(2014, 5, 20);
        Date fechaIngreso = fecha2.getTime();

        Pelicula todoPoderoso = new Pelicula(AnioEstreno, true, (short)120, fechaIngreso, "Todo Poderoso", "GOD", genero, calificacion, pais);

        System.out.println(todoPoderoso.getAnioEstreno());

    }
}
