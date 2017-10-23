# Estacionamiento
### Crear la clase Estacionamiento:

#### Variables de instancia:
* Patente del vehiculo `tipo String`
* Tipo de vehiculo`tipo String`
* Importe por hora `constantes tipo double`
    * Moto
    * Auto
    * Camioneta
* Importe por hora de exceso `constante double`
* Hora de ingreso `tipo int`
* Hora de egreso `tipo int`
* Minuto de ingreso `tipo int`
* Minuto de egreso `tipo int`

#### Agregar: 
* Constructor.
* Getters y Setters para todas las varibles de instancia.
* Getters para las constantes.
* Metodo `calcularTarifa` que calcule cuanto debe pagar cada vehculo teniendo en cuenta:

    * El importe a cobrar por cada tipo de vehiculo.
    * Por cada hora pasada las 10hs de estacionamiento se cobra un impuesto.
    * Si la diferencia entre minutos de egreso e ingreso es mayor a 10 se cobra como una hora de estacionamiento para el tipo de vehiculo en particular.

* Metodo `toString` debe devolver una cadena con el formato de tipo:
    > El vehiculo de tipo X con patente X ingreso a las X horas X minutos y salio a las X horas con X minutos, debe abonar X pesos.