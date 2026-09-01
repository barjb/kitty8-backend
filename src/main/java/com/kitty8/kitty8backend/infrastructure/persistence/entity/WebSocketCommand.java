package com.kitty8.kitty8backend.infrastructure.persistence.entity;

import com.kitty8.kitty8backend.domain.common.CommandType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class WebSocketCommand {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;
    private String player;
    private Game game;
    private Round round;
    private CommandType commandType;
    /*
        Payload is used to transfer data specific to the event like:
        - Cards draw
        - amount placed on the bet
     */
    private String payload;
    /**
     * Date of creation at backend
     * for both types of commands: created by backend and created by user.
     */
    private LocalDateTime createdAt;
}
