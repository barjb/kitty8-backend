package com.kitty8.kitty8backend.infrastructure.persistence.entity;

import com.kitty8.kitty8backend.domain.common.GameType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;
    private List<Player> players;
    private GameType type;
    @CreationTimestamp
    private LocalDateTime createdAt;

    public Game(UUID ID, List<Player> players, GameType type) {
        this.ID = ID;
        this.players = players;
        this.type = type;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameType getType() {
        return type;
    }

    public void setType(GameType type) {
        this.type = type;
    }
}
