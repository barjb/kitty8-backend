package com.kitty8.kitty8backend.infrastructure.persistence.entity;

import com.kitty8.kitty8backend.domain.common.GamePhase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
public class GameState {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;
    private List<Player> players;
    private Player currentPlayer;
    private GamePhase phase;
    private Game game;
    private Round round;
    private String payload;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
