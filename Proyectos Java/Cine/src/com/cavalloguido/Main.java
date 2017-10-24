package com.cavalloguido;

public class Main {

    public static void main(String[] args) {
//      TODO: Actor -> Sexo (Relación de Asosiación.)
//      Instanciamos el objeto sexo para definir el atributo.
        Sexo sexo = new Sexo("mujer");

//      Pasamos el objeto completo como parametro al constructor del objeto Actor.
        Actor actor = new Actor("juan", "perez", false, sexo);

//      podemos acceder al atributo mediante el getter.
        System.out.println(actor.getSexo().getNombre());


    }
}
