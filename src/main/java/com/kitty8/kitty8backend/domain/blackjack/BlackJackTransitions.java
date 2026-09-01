package com.kitty8.kitty8backend.domain.blackjack;

import com.kitty8.kitty8backend.domain.common.GameEngineEventType;
import com.kitty8.kitty8backend.domain.common.GamePhase;

import java.util.List;
import java.util.Map;

public class BlackJackTransitions {
    private final Map<GamePhase, Map<GameEngineEventType, GamePhase>> transitions = Map.of(
            GamePhase.START_STATE, Map.of(GameEngineEventType.START_GAME, GamePhase.AWAITING_ROUND),
            GamePhase.AWAITING_ROUND, Map.of(GameEngineEventType.START_ROUND, GamePhase.BETTING,
                    GameEngineEventType.END_GAME, GamePhase.END_STATE),
            GamePhase.BETTING, Map.of(GameEngineEventType.BET_PLACED, GamePhase.DEALING),
            GamePhase.DEALING, Map.of(GameEngineEventType.CARD_DRAW, GamePhase.PLAYER_TURN),
            GamePhase.PLAYER_TURN, Map.of(GameEngineEventType.PLAYER_HIT, GamePhase.DEALING,
                    GameEngineEventType.PLAYER_SPLIT, GamePhase.DEALING,
                    GameEngineEventType.PLAYER_DOUBLE_DOWN, GamePhase.DEALING,
                    GameEngineEventType.PLAYER_STAND, GamePhase.DEALER_TURN,
                    GameEngineEventType.PLAYER_END_DOUBLE_DOWN, GamePhase.DEALER_TURN),
            GamePhase.DEALER_TURN, Map.of(GameEngineEventType.CARD_DRAW, GamePhase.DEALER_TURN,
                    GameEngineEventType.DEALER_END_TURN, GamePhase.SETTLEMENT),
            GamePhase.SETTLEMENT, Map.of(GameEngineEventType.SETTLE_ROUND, GamePhase.ROUND_SETTLED),
            GamePhase.ROUND_SETTLED, Map.of(GameEngineEventType.END_ROUND, GamePhase.AWAITING_ROUND)
    );

    public List<GamePhase> getPossiblePhases(GamePhase phase, GameEngineEventType event) {
        Map<GameEngineEventType, GamePhase> gameEngineEventGamePhaseMap = transitions.get(phase);
        if (gameEngineEventGamePhaseMap == null) return null;
        if (!gameEngineEventGamePhaseMap.containsKey(event)) return null;
        return gameEngineEventGamePhaseMap.values().stream().toList();
    }

    public GamePhase getNextPhase(GamePhase phase, GameEngineEventType event) {
        Map<GameEngineEventType, GamePhase> gameEngineEventGamePhaseMap = transitions.get(phase);
        if (gameEngineEventGamePhaseMap == null) return null;
        if (!gameEngineEventGamePhaseMap.containsKey(event)) return null;
        return gameEngineEventGamePhaseMap.get(event);
    }
}
