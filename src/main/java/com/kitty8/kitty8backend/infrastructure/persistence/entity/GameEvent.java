package com.kitty8.kitty8backend.infrastructure.persistence.entity;

import com.kitty8.kitty8backend.domain.common.GameEngineEventType;
import jakarta.persistence.Entity;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class GameEvent {
    private UUID ID;
    private Player player;
    private Game game;
    private Round round;
    private long sequence;
    private GameEngineEventType gameEngineEventType;
    private String payload;
    @CreationTimestamp
    private LocalDateTime createdAt;
}
