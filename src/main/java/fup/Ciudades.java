/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fup;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Ciudades {

    Scanner in = new Scanner(System.in);
    String ciudades[] = new String[4];

    void llenarArreglo() {
        System.out.println("\nREGISTRAR CIUDADES..");
        for (int i = 0; i < ciudades.length; i++) {
            System.out.print("Ingrese el nombre de la ciudad: ");
            ciudades[i] = in.next();
        }
        System.out.println("Datos registrados");
    }

    void listarArreglo() {
        System.out.println("\nListando..\n");
        for (int i = 0; i < ciudades.length; i++) {
            System.out.print(ciudades[i] + " - ");
        }
        System.out.println("");
    }

    void listarArregloForMejorado() {
        System.out.println("\nListando con for mejorado..\n");
        for (String ciudade : ciudades) {
            System.out.print(ciudade + " - ");
        }
        System.out.println("");
    }

    void eliminarCiudad() {
        System.out.println("Eliminando datos...");
        System.out.print("Ingrese la ciudad a eliminar: ");
        String ciudad = in.next();
        boolean bandera = false;
        for (int i = 0; i < ciudades.length; i++) {
            if (ciudades[i].equalsIgnoreCase(ciudad)) {
                bandera = true;
                ciudades[i] = "";
            }
        }
        if (bandera == true) {
            System.out.println("Ciudad: " + ciudad + " eliminada correctamente");
        } else {
            System.out.println("Ciudad: " + ciudad + " no esta registrada");
        }
    }

    void menu() {
        int op;
        do {
            System.out.println("\n--MENU DE OPCIONES--");
            System.out.println("1.Registrar ciudades");
            System.out.println("2.Listar");
            System.out.println("3.Listar usando for mejorado");
            System.out.println("4.Eliminar datos");
            System.out.println("5.Salir");
            System.out.print("\nElija una opcion: ");
            op = in.nextInt();
            switch (op) {
                case 1 ->
                    this.llenarArreglo();
                case 2 ->
                    this.listarArreglo();
                case 3 ->
                    this.listarArregloForMejorado();
                case 4 ->
                    this.eliminarCiudad();
            }

        } while (op != 5);

    }
}
