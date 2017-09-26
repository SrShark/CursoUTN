package pokemones;

public class Pokemon {
    private String nombre;

    public pokemon(){

    }
    public pokemon (String nombre) {
        this.nombre = nombre;
    }

    // metodo get lleva String porque el tipo de variable que retorna.
    public String getNombre(){
        return this.nombre;
    }

    //metodo set es void porque no retorna nada
    public void setNombre(){
        this.nombre = nombre;
    }
}
