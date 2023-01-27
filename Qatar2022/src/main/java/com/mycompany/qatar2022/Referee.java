package com.mycompany.qatar2022;

/**
 *
 * @author hilavine
 */
public class Referee {
     String federation;
    
    String get_representation(){
        switch(federation){
            case "Concacaf":
                return "CC";
            case "Conmebol":
                return "CB";
        }
        return "";
    }
}
