/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deber6;

/**
 *
 * @author USERJUL20
 */
public class Deber6 {

    public static void main(String[] args) {
     // Crear instancia de Trabajador
        Trabajador t1 = new Trabajador("Lily Perez", 1000.00);
        t1.mostrarInformacion();

        System.out.println();

        // Crear instancia de Gerente
        Gerente g1 = new Gerente("Oscar Piastri", 2000.00, "Ventas");
        g1.mostrarInformacion();

        System.out.println();

        // Polimorfismo: tipo Trabajador apuntando a Gerente
        Trabajador t2 = new Gerente("Max Verstappen", 4000.00, "Recursos Humanos");
        t2.mostrarInformacion(); 
    }
}
