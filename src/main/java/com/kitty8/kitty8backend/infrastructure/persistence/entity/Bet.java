package com.kitty8.kitty8backend.infrastructure.persistence.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Bet {
    private UUID ID;
    private UUID gameID;
    private UUID roundID;
    private UUID userID;
    private BigDecimal amount;
    private BigDecimal payout;
    private LocalDateTime createdAt;

    public Bet(UUID ID, UUID roundID, BigDecimal amount, BigDecimal payout, LocalDateTime createdAt) {
        this.ID = ID;
        this.roundID = roundID;
        this.amount = amount;
        this.payout = payout;
        this.createdAt = createdAt;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public UUID getRoundID() {
        return roundID;
    }

    public void setRoundID(UUID roundID) {
        this.roundID = roundID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPayout() {
        return payout;
    }

    public void setPayout(BigDecimal payout) {
        this.payout = payout;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
