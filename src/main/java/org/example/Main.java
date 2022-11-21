package org.example;

import java.util.Scanner;
import org.example.clases.*;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Lugar objetoLugar = new Lugar();
        Costo objetoCosto = new Costo();




        System.out.println("********** Fiesta Grupo Uribe ****************");
        System.out.println("Ingrese el aforo del lugar");
        objetoLugar.setAforo(entrada.nextInt());
        int capacidadLugar = objetoLugar.getAforo();
        // vector para guardar objetos del tipo participante
        // el tamaño del vector que almacenará las personas será el del aforo del lugar
        Participante[] participantes = new Participante[objetoLugar.getAforo()];
        int opcion;

        do {
            System.out.println("Presione");
            System.out.println("0. para salir del menu");
            System.out.println("1. para ingresar el lugar");
            System.out.println("2. para ingresar los costos de la fiesta");
            System.out.println("3. para ingresar los participantes de la fiesta");
            System.out.println("4. Mostrar los invitados que han ingresado a la fiesta");
            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Ingrese el nombre del lugar de la fiesta: ");
                    objetoLugar.setNombreLugar(entrada.next());
                    System.out.print("Ingrese la dirección del lugar ");
                    objetoLugar.setDireccionLugar(entrada.next());
                    break;
                case 2:
                    System.out.print("Ingrese el costo del lugar: ");
                    objetoCosto.setCostoLugar(entrada.nextDouble());
                    System.out.print("Ingrese el costo de los alimentos: ");
                    objetoCosto.setCostoAlimentos(entrada.nextDouble());
                    System.out.print("Ingrese el costo de las bebidas: ");
                    objetoCosto.setCostoBebidas(entrada.nextDouble());
                    System.out.println("Ingrese el costo de los equipos: ");
                    objetoCosto.setCostoEquipos(entrada.nextDouble());
                    break;
                case 3:
                    participantes[capacidadLugar - objetoLugar.getAforo()] = new Participante();
                    System.out.println("Ingrese el nombre del participante " + (capacidadLugar - objetoLugar.getAforo()));
                    participantes[capacidadLugar - objetoLugar.getAforo()].setNombre(entrada.next());
                    objetoLugar.setAforo(objetoLugar.getAforo()-1);

                    break;
                case 4:

                    for (int i = 0; i < participantes.length; i++){
                        participantes[i].mostrarNombreInvitado();
                    }

                    break;



            }





        }while(opcion != 0);









    }
}