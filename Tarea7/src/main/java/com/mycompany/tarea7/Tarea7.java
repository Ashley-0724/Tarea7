/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea7;

/**
 *
 * @author USERJUL20
 */
public class Tarea7 {

    public static void main(String[] args) {
       
        // Crear objeto usando el constructor por defecto
    Vehiculo auto1 = new Vehiculo();
    auto1.mostrarInformacion();

    System.out.println();

       // Crear objeto usando constructor con todos los parámetros
    Vehiculo auto2 = new Vehiculo("Honda", "Civic", 2018);
    auto2.mostrarInformacion();

    System.out.println();
    
    Vehiculo auto3 = new Vehiculo ("BMW", "Serie 3", 2021);
    auto3.mostrarInformacion();
    
    System.out.println();

       // Crear objeto usando constructor sobrecargado
    Vehiculo auto4 = new Vehiculo("Ford", "Mustang");
    auto4.mostrarInformacion();
    
    
    }
}
