package com.kitty8.kitty8backend.infrastructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;
    private Game game;
    private Round round;
    private Player player;
    private BigDecimal amount;
    private BigDecimal payout;
    @CreationTimestamp
    private LocalDateTime createdAt;

    public Bet(UUID ID, Game game, Round round, Player player, BigDecimal amount, BigDecimal payout, LocalDateTime createdAt) {
        this.ID = ID;
        this.game = game;
        this.round = round;
        this.player = player;
        this.amount = amount;
        this.payout = payout;
        this.createdAt = createdAt;
    }

    public UUID getID() {
        return ID;
    }

    public Game getGame() {
        return game;
    }

    public Round getRound() {
        return round;
    }

    public Player getPlayer() {
        return player;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getPayout() {
        return payout;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
