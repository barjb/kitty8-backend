package com.kitty8.kitty8backend.infrastructure.persistence.entity;

import java.util.UUID;

public class Player {
    private final UUID id;

    private final String name;

    public Player(String name, UUID id) {
        this.name = name;
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
