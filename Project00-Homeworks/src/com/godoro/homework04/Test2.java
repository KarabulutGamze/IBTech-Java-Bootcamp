package com.godoro.homework04;

import java.util.ArrayList;

public class Test2 {
	
public static void main(String[] args) {
        
        League leagueA=new League(601,"Süperlig");
        leagueA.setPlayerList(new ArrayList<>());
        
        Team teamA=new Team(801,"Godoro Spor");
        teamA.setPlayerList(new ArrayList<>());
        
        Team teamB=new Team(802,"Fibiler Spor");
        teamB.setPlayerList(new ArrayList<>());
        
        Player player1=new Player(401,"Teoman Alpay", 4.67);
        player1.setTeam(teamA);
        teamA.getPlayerList().add(player1);
        
        Player player2=new Player(402,"Yusuf Nalkesen", 7.89);
        player2.setTeam(teamA);
        teamA.getPlayerList().add(player2);
        
        Player player3=new Player(404,"Avni Anıl", 6.61);
        player3.setTeam(teamA);
        teamA.getPlayerList().add(player3);
        
        Player player4=new Player(403,"Yıldırım Gürses", 2.93);
        player3.setTeam(teamB);
        teamB.getPlayerList().add(player4);
        
        Player player5=new Player(405,"Erdoğan Berker", 8.11);
        player5.setTeam(teamB);
        teamB.getPlayerList().add(player5);
        
        System.out.println(leagueA.getLeagueId()+" "+leagueA.getLeagueName());
        
        System.out.println("  "+teamA.getTeamId()+" "+teamA.getTeamName());
        for(Player player : teamA.getPlayerList()) {
            System.out.println("\t"+player.getPlayerId()+" " +player.getPlayerName()+" " +player.getAverageScore());
        }
        
        System.out.println("  "+teamB.getTeamId()+" "+teamB.getTeamName());
        for(Player player : teamB.getPlayerList()) {
            System.out.println("\t"+player.getPlayerId()+" " +player.getPlayerName()+" " +player.getAverageScore());
        }
        
        
        
    }

}
