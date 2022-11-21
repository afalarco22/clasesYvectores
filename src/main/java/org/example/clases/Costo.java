package org.example.clases;

public class Costo {

    // Atributos
    private double costoLugar;
    private double costoBebidas;
    private double costoEquipos;
    private double costoAlimentos;


    // constructor
    public Costo() {
    }

    public Costo(double costoLugar, double costoBebidas, double costoEquipos, double costoAlimentos) {
        this.costoLugar = costoLugar;
        this.costoBebidas = costoBebidas;
        this.costoEquipos = costoEquipos;
        this.costoAlimentos = costoAlimentos;

    }

    // getters y setters


    public double getCostoLugar() {
        return costoLugar;
    }

    public void setCostoLugar(double costoLugar) {
        this.costoLugar = costoLugar;
    }

    public double getCostoBebidas() {
        return costoBebidas;
    }

    public void setCostoBebidas(double costoBebidas) {
        this.costoBebidas = costoBebidas;
    }

    public double getCostoEquipos() {
        return costoEquipos;
    }

    public void setCostoEquipos(double costoEquipos) {
        this.costoEquipos = costoEquipos;
    }

    public double getCostoAlimentos() {
        return costoAlimentos;
    }

    public void setCostoAlimentos(double costoAlimentos) {
        this.costoAlimentos = costoAlimentos;
    }
}// fin clase
