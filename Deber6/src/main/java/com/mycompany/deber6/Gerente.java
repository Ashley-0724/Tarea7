/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber6;

/**
 *
 * @author USERJUL20
 */
    // Clase derivada: Gerente
public class Gerente extends Trabajador {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // llama al constructor de Trabajador
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Metodo polimorfismo
   
    public void mostrarInformacion() {
        System.out.println("Gerente: " + getNombre());
        System.out.println("Salario: $" + getSalario());
        System.out.println("Departamento: " + departamento);
    }
}