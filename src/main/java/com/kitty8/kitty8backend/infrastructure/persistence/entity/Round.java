package com.kitty8.kitty8backend.infrastructure.persistence.entity;

import java.util.List;
import java.util.UUID;

public class Round {
    private UUID ID;
    private List<Player> players;
    private String startedAt;
    private String finishedAt;

    public Round(UUID ID, String startedAt, String finishedAt) {
        this.ID = ID;
        this.startedAt = startedAt;
        this.finishedAt = finishedAt;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }
}
