package com.cavalloguido;

public class Estacionamiento {

    private final double importePorHoraMoto = 10.0;
    private final double importePorHoraAuto = 25.0;
    private final double importePorHoraCamioneta = 50.0;
    private final double importePorExcesoPorHora = 10.0;
    private String tipoVehiculo;
    private String patente;
    private int horaIngreso;
    private int horaEgreso;
    private int minutoIngreso;
    private int minutoEgreso;

    public Estacionamiento(String tipoVehiculo, String patente, int horaIngreso, int minutoIngreso, int horaEgreso, int minutoEgreso) {
        this.tipoVehiculo = tipoVehiculo;
        this.patente = patente;
        this.horaIngreso = horaIngreso;
        this.minutoIngreso = minutoIngreso;
        this.horaEgreso = horaEgreso;
        this.minutoEgreso = minutoEgreso;
    }

    private double getImporteVehiculo() {
        double ImporteVehiculo = 0;

        switch (tipoVehiculo) {
            case "moto": ImporteVehiculo = getImportePorHoraMoto();
                break;
            case "auto": ImporteVehiculo = getImportePorHoraAuto();
                break;
            case "camioneta": ImporteVehiculo = getImportePorHoraCamioneta();
                break;
        }

        return ImporteVehiculo;
    }

    private int getHorasEstacionado() {
        int horasEstacionado = getHoraEgreso() - getHoraIngreso();

        // Agrego una hora mas si exede de los 10 minutos.
        if (getMinutoEgreso() > 10) {
            horasEstacionado += 1;
        }

        return horasEstacionado;
    }

//  TODO: separar las horas normales de las exedentes para que sumen por importes separados!:
    private int getHorasExedentes() {
        int horasExedentes = 0;

        if (getHorasEstacionado() > 10) {
            horasExedentes = getHorasEstacionado() - 10;
        }

        return horasExedentes;
    }

    private double calcularTarifa() {

        double importeTotal = getHorasEstacionado() * getImporteVehiculo();

        if (getHorasExedentes() != 0) {
            double improteExedente = getHorasExedentes() * (getImporteVehiculo() + getImportePorExcesoPorHora());
            importeTotal += improteExedente;
        }

        return importeTotal;
    }

    @Override
    public String toString() {
        return String.format("El vehiculo de tipo %s con patente %s ingreso a las %d:%d Hs y salio a las %d:%d Hs, debe abonar $%.2f pesos", getTipoVehiculo(), getPatente(), getHoraIngreso(), getMinutoIngreso(), getHoraEgreso(), getMinutoEgreso(), calcularTarifa());
    }

    // Getters and Setters
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getImportePorHoraMoto() {
        return importePorHoraMoto;
    }

    public double getImportePorHoraAuto() {
        return importePorHoraAuto;
    }

    public double getImportePorHoraCamioneta() {
        return importePorHoraCamioneta;
    }

    public double getImportePorExcesoPorHora() {
        return importePorExcesoPorHora;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public int getHoraEgreso() {
        return horaEgreso;
    }

    public void setHoraEgreso(int horaEgreso) {
        this.horaEgreso = horaEgreso;
    }

    public int getMinutoIngreso() {
        return minutoIngreso;
    }

    public void setMinutoIngreso(int minutoIngreso) {
        this.minutoIngreso = minutoIngreso;
    }

    public int getMinutoEgreso() {
        return minutoEgreso;
    }

    public void setMinutoEgreso(int minutoEgreso) {
        this.minutoEgreso = minutoEgreso;
    }
}
