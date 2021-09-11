package com.tahmid;

public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;

    Cricket(String matchType, int over, Player player){
        this.matchType = matchType;
        this.over = over;
        this.player = player;
    }

    void display(Cricket cricket){
        System.out.println("Match type:" + cricket.matchType);
        System.out.println("Over of the match:" + cricket.over);
        System.out.println("Player Name:" + player.playerName);
        System.out.println("Jersey Number:" + player.jerseyNumber);
    }

}
