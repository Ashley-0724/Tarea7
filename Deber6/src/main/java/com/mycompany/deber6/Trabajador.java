/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deber6;

/**
 *
 * @author USERJUL20
 */
public class Trabajador {
    // Clase base: Trabajador

    private String nombre;
    private double salario;

    public Trabajador(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Metodos de encapsulación
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método polimorfismo
    public void mostrarInformacion() {
        System.out.println("Trabajador: " + nombre);
        System.out.println("Salario: $" + salario);
    }
}
