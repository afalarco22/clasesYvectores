package org.example.clases;

public class Participante {
    // Atributos
    // Recordar, los atributos no se inicializan
    // recordar, atributos y variables empiezan con minúscula
    // recordar, las clases empiezan en mayúscula y van en singular
    // recordar, el construtor tiene el mismo nombre de la clase y es el único
    // método que empieza con mayúscula, los demás método se nombran con minúscila
    // y en verbo infinitivo

    // Atributos
    private String nombre;
    private String apellido;
    private String id;
    private int edad;
    private double valorCover;

    // constructor vacío y lleno
    public Participante() {
    }

    public Participante(String nombre, String apellido, String id, int edad, double valorCover) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.edad = edad;
        this.valorCover = valorCover;
    }

    // gettes y setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getValorCover() {
        return valorCover;
    }

    public void setValorCover(double valorCover) {
        this.valorCover = valorCover;
    }

    public void mostrarNombreInvitado(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: "+ this.apellido);
        System.out.println("Identificación:" + this.id);
        System.out.println("Edad: " + this.edad);
        System.out.println("Valor cover: " + this.valorCover);
    }





}
