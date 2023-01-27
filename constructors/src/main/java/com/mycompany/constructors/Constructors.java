package com.mycompany.constructors;

/**
 * @author hilavine
 */
public class Constructors {

    public static void main(String[] args) {
        
        Player p1 = new Player();
        
        System.out.println("Team = " + p1.team);
        
        Player p2 = new Player("Mbappe","10", "France");
        
        System.out.println(p2.name);
        
        Player p3 = new Player("Ochoa","","Mexico");
        
        System.out.println(p3.name+" es de "+ p3.team);


         System.out.println(p1.name = "Kane");
         
         Team t1 = new Team(1,"Francia",2);
         Team t2 = new Team(30, "Mexico", 0);
         
         System.out.println("Ranking -> "+t1.Ranking);
         System.out.println("Name -> "+t1.name);
         System.out.println("World Championships -> "+t1.WorldChampionships);
         
         System.out.println("equipo "+t2.name+" Ranking "+t2.Ranking+" wc "+t2.WorldChampionships );
    }
}
