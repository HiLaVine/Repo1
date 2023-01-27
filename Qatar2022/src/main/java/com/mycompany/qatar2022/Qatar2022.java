package com.mycompany.qatar2022;

/**
 * @author hilavine
 */
public class Qatar2022 {

    public static void main(String[] args) {
    Player p1 = new Player();
    p1.name = "Messi";    
    p1.number = "10";
    p1.team = "Argentina";
    p1.goals = 3;

    System.out.println("name = "+ p1.name);
    
    Player p2 = new Player();
    p2.name = "Ronaldo";    
    p2.number = "7";
    p2.team = "Portugal";
    p2.goals = 1;
    
    System.out.println("name = "+ p2.name);
    
        for (int i = 0; i < 4; i++) {
            p1.score_goal();
        }
    
        System.out.println("messi tiene "+p1.goals+" goles");
        
        p1.score_goal(3);
        
        System.out.println("messi tiene "+p1.goals+" goles");
                
    Coach c1 = new Coach();
    
    c1.name = "Tata Martino";
    c1.tactic = "4-4-3";
    c1.nationality = "Argentina";
    c1.get_info();
    
    Referee r1 = new Referee();
    
    r1.federation = "Concacaf";
    
        System.out.println(r1.get_representation());
        
       
    Team t1 = new Team();
    
    t1.name = "Brazil";
    
        System.out.println("Ranking = "+t1.ranking);
        t1.up_ranking();
        System.out.println("Ranking = "+t1.ranking);
  
    
    }
    
}
