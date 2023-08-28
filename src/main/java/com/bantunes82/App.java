package com.bantunes82;

public class App {

    public static void main(String[] args) {
        Team team = Team.of("Java");

        //with repository
        ChampionLeague championLeague = null;
        championLeague.subscribe(team);

        //with DAO
        TeamDAO teamDAO = new TeamDAO();
        teamDAO.insert(team);

    }
}
