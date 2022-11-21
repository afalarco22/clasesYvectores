package org.example.clases;

public class Lugar {

    // atributos
    private String nombreLugar;
    private String direccionLugar;
    private int aforo;

    // constructores
    public Lugar() {
    }

    public Lugar(String nombreLugar, String direccionLugar, int aforo) {
        this.nombreLugar = nombreLugar;
        this.direccionLugar = direccionLugar;
        this.aforo = aforo;
    }

    // getters y setters


    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getDireccionLugar() {
        return direccionLugar;
    }

    public void setDireccionLugar(String direccionLugar) {
        this.direccionLugar = direccionLugar;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        if(aforo <=50 && aforo > 0){
            this.aforo = aforo;
        }else if( aforo <= 0){
            System.out.println("El aforo no puede ser negativo");

        }else{
            System.out.println("El lugar no es suficientemente grande para realizar la fiesta");
        }
    }
}// fin clase
