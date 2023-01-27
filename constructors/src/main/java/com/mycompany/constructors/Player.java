package com.mycompany.constructors;

/**
 * @author hilavine
 */
public class Player {
    
    String name;
    String num;
    String team;
    
    Player(){ //constructor = Mètodo sin 
    name = "Giroud";
    num= "9";
    team = "France";
    }
    
    //constructor con parametros (3 cadenas)
    
    Player(String name, String num, String team){
        this.name = name;
        this.num= num;
        this.team = team;
    }
}
