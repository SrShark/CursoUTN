package com.cavalloguido;

public class Salario {
    private int horasTrabajadas;
    private int horasExtras;
    private int antiguedad;
    private int retenciones;
    private int costoHora = 120;
    private int costoHoraExtra = 160;

    public Salario(int horasTrabajadas, int antiguedad) {
        this.horasTrabajadas = horasTrabajadas;
        this.antiguedad = antiguedad;
    }

    private int calcularSalarioNeto(){
        int horasTope = 160;
        int salarioHoras = 0;

        // 180 horas
        for (int i = 1; i < getHorasTrabajadas(); i++) {
            if (i <= horasTope) {
                salarioHoras += i * getCostoHora();
            }
            else {
                salarioHoras += i * getCostoHoraExtra();
            }
        }

        return salarioHoras;
    }

    // TODO: Terminar esta clase
    private int calcularRetenciones(){
        int retencionMinima = 20;
        int retencionMaxima = 24;
        int monto = 18000;

        //Al sueldo bruto calculado se le aplica una retención del 20% hasta los $18.000 o el 24% en caso de superar ese importe, para obtener el sueldo neto.
        if (calcularSalarioNeto() <= monto) {

        }
    }

    // Geters and Setters
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(int retenciones) {
        this.retenciones = retenciones;
    }

    public int getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(int costoHora) {
        this.costoHora = costoHora;
    }

    public int getCostoHoraExtra() {
        return costoHoraExtra;
    }

    public void setCostoHoraExtra(int costoHoraExtra) {
        this.costoHoraExtra = costoHoraExtra;
    }
}