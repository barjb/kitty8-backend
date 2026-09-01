package com.kitty8.kitty8backend.infrastructure.persistence.entity;

import java.util.List;
import java.util.UUID;

public class Game {
    private UUID ID;
    private List<Player> players;

    public Game(UUID ID, List<Player> players) {
        this.ID = ID;
        this.players = players;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public List<Player> getUsers() {
        return players;
    }

    public void setUsers(List<Player> players) {
        this.players = players;
    }
}
