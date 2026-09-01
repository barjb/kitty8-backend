package com.kitty8.kitty8backend.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.util.List;
import java.util.UUID;

@Entity
public class Round {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;
    private List<Player> players;

    @CreationTimestamp
    private String createdAt;
    private String finishedAt;

    public Round(UUID ID, List<Player> players, String createdAt, String finishedAt) {
        this.ID = ID;
        this.players = players;
        this.createdAt = createdAt;
        this.finishedAt = finishedAt;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }
}
