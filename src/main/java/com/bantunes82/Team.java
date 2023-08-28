package com.bantunes82;

import java.util.*;

//aggregator
public class Team {

    public static final int JOGADORES_TIME = 11;

    private final String name;

    private List<Player> players;

    private Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public static Team of(String name){
        Objects.requireNonNull(name, "name is required");
        return new Team(name);
    }

    /**
     * Adiciona um novo jodador ao time
     * @param player um novo jogador
     * @throws NullPointerException quando o parametro é nulo
     * @throws TeamException quando o time está completo
     */
    public void add(Player player){
        Objects.requireNonNull(player, "player is required");
        if (this.players.size() == JOGADORES_TIME){
            throw new TeamException("The team is already completed, there is no space for the player: " + player);
        }
        this.players.add(player);
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

    public String getName() {
        return name;
    }

    public boolean isEmpty() {
        return this.players.isEmpty();
    }
}
