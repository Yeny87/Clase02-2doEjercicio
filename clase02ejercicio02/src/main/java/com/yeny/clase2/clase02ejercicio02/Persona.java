/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yeny.clase2.clase02ejercicio02;

/**
 *
 * @author Sandra
 */
public class Persona {
    
    protected String Nombre, Direccion, FechaNC, Genero; 
    protected int Edad;
    

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Direccion=" + Direccion + ", FechaNC=" + FechaNC + ", Genero=" + Genero + ", Edad=" + Edad + '}';
    }
    
    
    
}
