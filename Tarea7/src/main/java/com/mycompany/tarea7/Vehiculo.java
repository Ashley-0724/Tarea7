/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea7;

/**
 *
 * @author USERJUL20
 */
public class Vehiculo {
    
    // Atributos 
    String marca;
    String modelo;
    int año;

    // Constructor por defecto
    public Vehiculo() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.año = 1999;
        System.out.println("Constructor por defecto ejecutado.");
    }

    // Constructor parametrizado: inicializa todos los atributos
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        System.out.println("Constructor con todos los parámetros ejecutado.");
    }

    // Constructor sobrecargado: solo marca y modelo, año por defecto
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = 2020;
        System.out.println("Constructor sobrecargado ejecutado.");
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // Mostrar información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}
