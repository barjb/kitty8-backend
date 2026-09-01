package com.kitty8.kitty8backend.domain.roulette;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Wager {
    private UUID ID;
    private UUID gameID;
    private UUID roundID;
    private UUID playerID;
    private List<WagerBet> bets;

    private BigDecimal payout;

    private class WagerBet {
        private BetType type;
        private BigDecimal amount;
    };

    private enum BetType {
        //TODO FINISH
        STRAIGHT,
        RED,
        BLACK,
        ODD,
        EVEN,
        LOW,
        HIGH,
        DOZEN,
        COLUMN,
        SPLIT,
        STREET,
        CORNER
    }
}
