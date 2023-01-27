package com.mycompany.qatar2022;

/**
 *
 * @author hilavine
 */
public class Player {
    String name;
    String number;
    int goals;
    String team;
    
void score_goal(){
    goals++;
}

void score_goal(int goals){
    this.goals = this.goals+ goals;
}
}
