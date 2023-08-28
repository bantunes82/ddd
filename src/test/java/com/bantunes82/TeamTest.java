package com.bantunes82;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    @Test
    public void shouldCreateTeam(){
        Team corinthians = Team.of("Corinthians");

        Assertions.assertNotNull(corinthians);
        Assertions.assertEquals("Corinthians", corinthians.getName());
        Assertions.assertTrue(corinthians.isEmpty());
    }

    @Test
    public void shouldNotBeOverPlayer(){
        Team corinthians = Team.of("Corinthians");

        for (int index = 0; index < 11; index++) {
            Player player = Player.builder().name("Player " + index).build();
            corinthians.add(player);
        }

        TeamException exception = assertThrows(TeamException.class, () ->
                corinthians.add(Player.builder().name("Bruno").build()));

        System.out.println("Error message: " + exception.getMessage());
    }

}