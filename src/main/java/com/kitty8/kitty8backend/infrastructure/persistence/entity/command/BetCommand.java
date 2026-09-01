package com.kitty8.kitty8backend.infrastructure.persistence.entity.command;

import java.math.BigDecimal;

public class BetCommand extends BaseCommand {
    private final BigDecimal bet;

    public BetCommand(BigDecimal bet) {
        this.bet = bet;
    }

    public BigDecimal getBet() {
        return bet;
    }
}
