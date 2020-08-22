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
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Profesor profe = new Profesor("Yeny", "Agua Caliente","22/01/01", "F", 19, "Bachillerato", "Estudiante");
        System.out.println(profe.toString());
        
        
        Estudiante est = new Estudiante("Daniel", "Chalate", "29/10/02", "M", 18, 1500, "Ing. Sistemas y Computacion");
        
        System.out.println(est.toString());
        
        
    }
    
}
