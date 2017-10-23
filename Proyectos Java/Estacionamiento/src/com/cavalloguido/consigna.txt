Crear la clase Estacionamiento con las siguientes consignas:

Variables de instancia:
    patente del vehiculo de tipo String
    tipo de vehiculo de tipo String
    importe por hora para moto, auto y camioneta como 3 constantes de tipo double
    Importe por hora de exceso como constante double
    hora de ingreso tipo byte
    hora de egreso tipo byte
    minuto de ingreso tipo short
    minuto de egreso tipo short

Agregar constructores.
Agregar getters y setters para todas las varibles de instancia;.
Agregar getters para las constantes.

Agregar el metodo calcular tarifa que calcule cuanto debe pagar cada vehculo teniendo en cuenta:

    * El importe a cobrar por cada tipo de vehiculo.
    * Por cada hora pasada las 10 hs de estacionamiento se cobra un importe especial.
    * Si la diferencia entre minutos de egreso e ingreso es mayor a 10 se cobra como una hora de estacionamiento para el tipo de vehiculo en particular

El metodo toString debe devolver una cadena con el formato de tipo:
    El vehiculo de tipo X con patente X ingreso a las X horas X minutos y salio a las X horas con X minutos, debe abonar X pesos