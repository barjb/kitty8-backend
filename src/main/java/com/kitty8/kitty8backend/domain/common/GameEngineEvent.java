package com.kitty8.kitty8backend.domain.common;

import java.util.List;

public enum GameEngineEvent {
    PLAYER_JOINED,
    PLAYER_LEFT,

    START_GAME,
    END_GAME,
    START_ROUND,
    END_ROUND,

    BET_PLACED,
    CARD_DRAW,
    SETTLE_ROUND,

    // BLACKJACK
    PLAYER_HIT,
    PLAYER_SPLIT,
    PLAYER_DOUBLE_DOWN,
    PLAYER_END_DOUBLE_DOWN,
    PLAYER_STAND,
    DEALER_END_TURN,

    // ROULETTE
    PLAYER_SPIN;

    public boolean isRouletteEvent(GameEngineEvent event) {
        return List.of(
                START_GAME,
                END_GAME,
                START_ROUND,
                PLAYER_SPIN,
                SETTLE_ROUND,
                END_ROUND,
                PLAYER_JOINED,
                PLAYER_LEFT
        ).contains(event);
    }

    public boolean isBlackJackEvent(GameEngineEvent event) {
        return List.of(
                START_GAME,
                END_GAME,
                START_ROUND,
                BET_PLACED,
                CARD_DRAW,
                PLAYER_HIT,
                PLAYER_SPLIT,
                PLAYER_DOUBLE_DOWN,
                PLAYER_END_DOUBLE_DOWN,
                PLAYER_STAND,
                DEALER_END_TURN,
                SETTLE_ROUND,
                END_ROUND
        ).contains(event);
    }

    public boolean isBaccaratEvent(GameEngineEvent event) {
        return List.of(
                START_GAME,
                END_GAME,
                START_ROUND,
                BET_PLACED,
                CARD_DRAW,
                SETTLE_ROUND,
                END_ROUND
        ).contains(event);
    }
}
