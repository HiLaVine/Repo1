package com.mycompany.mavenproject1;

/**
 * @author hilavine
 */

public class Mavenproject1 {

    public static void main(String[] args) {
        
        String objetoTipoString = new String("World #cup Francia 98"); 
        
        System.out.println(objetoTipoString.matches("(.*)Francia(.*)")); 
        System.out.println(objetoTipoString.matches("[A-z 0-9#()]+"));
        System.out.println("");
        System.out.println(Math.abs(-10));
        System.out.println(Math.acos(1));
        System.out.println(Math.asin(1));
        System.out.println(Math.atan(1));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.decrementExact(1));
        System.out.println(Math.exp(5));
        System.out.println(Math.hypot(1,2));
        System.out.println(Math.max(10,200));
        System.out.println(Math.sqrt(9));
        
        /*
        1.- StringBuffer y StringBuilder son mutables, mientras que
            String es inmutable.
        2.- ¿Qué es una clase? 
            Las clases son plantillas para la creación de objetos.
        */
    
    }
    
    
}
