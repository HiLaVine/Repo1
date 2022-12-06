package com.mycompany.candenas;

/**
 *
 * @author hilavine
 */
public class Candenas {

    public static void main(String[] args) {
        
        String calificado = "Mexico";
        String eliminado = "Polonia";
        
        System.out.println("calificado="+calificado); //imprime el string
        System.out.println("eliminado="+eliminado); //imprime el string
        System.out.println(calificado.toUpperCase()); //pasa a mayusculas el string
        System.out.println(eliminado.replace('o', 'a')); //reemplaza el char por otro
        System.out.println(calificado.toLowerCase()); //pasa a minusculas el string
        System.out.println(calificado.charAt(2)); //nos da el char en la posicion x del string
        System.out.println(calificado.length()); //nos muestra la longitud del string
        System.out.println(eliminado.indexOf('n')); //busca en que posicion esta el char
        System.out.println(calificado.concat(eliminado)); //concatena dos strings
        System.out.println(calificado.equals(eliminado)); //verifica si dos strings son iguales
        System.out.println(calificado.compareTo(calificado));//compara dos strings
        
        StringBuffer mex_player = new StringBuffer("Chucky");
        StringBuffer pol_player = new StringBuffer("lewandowski");
        System.out.println(mex_player.append(" Lozano"));
        System.out.println(pol_player.append(9));
        System.out.println(mex_player.delete(2, 6));//borra datos desde una posicion a otra
        System.out.println(mex_player.deleteCharAt(0));//borra el elemento seleccionado
        System.out.println(mex_player.reverse()); //invierte la cadena
        StringBuffer arg_player = new StringBuffer("Messi"); 
        System.out.println(arg_player.reverse().deleteCharAt(0)); //invierte la cadena y borra el primer elemento
        arg_player.insert(0, 'i');
        System.out.println(arg_player.reverse());
        
        StringBuilder worldcup = new StringBuilder("Qatar 2022");
        System.out.println(worldcup.append(9.5));
        System.out.println(worldcup.append(Math.PI));
        System.out.println(worldcup.toString().replace(worldcup, "Brazil 2014"));
        
        
        
        
         
    }
}
