package com.mycompany.ejercicios12062022;

/**
 *
 * @author HiLaVine
 */
public class Ejercicios12062022 {

    public static void main(String[] args) {
        
        //String
         System.out.println("Ejercicios de Strings");
        StringBuilder team = new StringBuilder("Spain");
       
        System.out.println(team.append(" vs Morocco "));
        System.out.println(team.reverse());
        System.out.println(team.reverse());
        System.out.println(team.length());
        System.out.println(team.lastIndexOf("o"));
        System.out.println(team.replace(0, 5, "Portugal"));
        team.setCharAt(19, '.');
        System.out.println(team);
        
        //Math
        System.out.println("\nEjercicios con Math");
        System.out.println(Math.abs(Math.cos(Math.sin(Math.PI))));
        System.out.println(Math.cbrt(Math.log10(1000)));
        System.out.println(Math.toDegrees(Math.PI));
        
        /*
        ¿Qué es un objeto?
            Un objeto son una entidad que representa información sobre una cosa dentro del código de un programa.
        ¿Qué es una clase? 
            Las clases son plantillas para la creación de objetos.
        ¿Qué es un método de objeto? 
            Un método es una porción de código que realiza tareas asociadas a un objeto, básicamente un método es una 
            función que pertenece a un objeto o clase.
        ¿Qué es un método de clase ? 
            Los métodos de una clase son funciones que sirven para manipular las variables de la clase.
        ¿Con que palabra reservada se crea un objeto?
            A través de la palabra reservada new.
        */
        
    }
}
