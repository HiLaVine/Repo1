/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios12072022;

/**
 *
 * @author hilavine
 */
public class Ejercicios12072022 {

    public static void main(String[] args) {
        
        StringBuffer wc = new StringBuffer("Qatar ");
        
        System.out.println(wc);
        System.out.println(wc.insert(6, "2022"));
        System.out.println(wc);
        
        System.out.println(wc.insert(0, "USA, Mexico y Canada 2026 es depues de "));
        System.out.println(wc.lastIndexOf("x"));
        System.out.println(wc.substring(0, 23));
        System.out.println(wc.substring(23, 49));
        
        StringBuffer favourite = new StringBuffer("Brazil is the favourite team for winning the World Cup");
        
        System.out.println("");
        System.out.println(favourite);
        System.out.println(favourite.length());
        System.out.println(favourite.delete(0, 26));
        System.out.println(favourite.deleteCharAt(0));
        System.out.println("");
        System.out.println(String.format("%.2f", 750.889));
        System.out.println(String.format("%d", 750));
        System.out.println(String.format("%e", 750.889));
        System.out.println(String.format("%o", 8));
        System.out.println(String.format("%x", 15));
        System.out.println(String.format("%c", '5'));
        System.out.println("");
        System.out.println(Math.PI);
        System.out.println(String.format("%.10f",Math.PI));
                
        /*
        1 ¿Por qué format es un método de clase ?
            porque sirve para manipular las variables de la clase
        2 ¿Por qué length o delete, son métodos de objeto?
            Son funciones que permiten efectuar algo sobre el objeto
        3 ¿ Necesitamos crear un objeto para usar el método format  ?
            No
        4 ¿Necesitamos crear un objeto para usar el método insert?
            Si
        5 ¿ Qué tipo de retorno tiene el método format ?
            Un dato de tipo String
        */
        
    }
}
