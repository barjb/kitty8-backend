package com.kitty8.kitty8backend.domain.blackjack;

import com.kitty8.kitty8backend.domain.common.GameEngineEvent;
import com.kitty8.kitty8backend.domain.common.GamePhase;

import java.util.List;
import java.util.Map;

public class BlackJackTransitions {
    private final Map<GamePhase, Map<GameEngineEvent, GamePhase>> transitions = Map.of(
            GamePhase.START_STATE, Map.of(GameEngineEvent.START_GAME, GamePhase.AWAITING_ROUND),
            GamePhase.AWAITING_ROUND, Map.of(GameEngineEvent.START_ROUND, GamePhase.BETTING,
                    GameEngineEvent.END_GAME, GamePhase.END_STATE),
            GamePhase.BETTING, Map.of(GameEngineEvent.BET_PLACED, GamePhase.DEALING),
            GamePhase.DEALING, Map.of(GameEngineEvent.CARD_DRAW, GamePhase.PLAYER_TURN),
            GamePhase.PLAYER_TURN, Map.of(GameEngineEvent.PLAYER_HIT, GamePhase.DEALING,
                    GameEngineEvent.PLAYER_SPLIT, GamePhase.DEALING,
                    GameEngineEvent.PLAYER_DOUBLE_DOWN, GamePhase.DEALING,
                    GameEngineEvent.PLAYER_STAND, GamePhase.DEALER_TURN,
                    GameEngineEvent.PLAYER_END_DOUBLE_DOWN, GamePhase.DEALER_TURN),
            GamePhase.DEALER_TURN, Map.of(GameEngineEvent.CARD_DRAW, GamePhase.DEALER_TURN,
                    GameEngineEvent.DEALER_END_TURN, GamePhase.SETTLEMENT),
            GamePhase.SETTLEMENT, Map.of(GameEngineEvent.SETTLE_ROUND, GamePhase.ROUND_SETTLED),
            GamePhase.ROUND_SETTLED, Map.of(GameEngineEvent.END_ROUND, GamePhase.AWAITING_ROUND)
    );

    public List<GamePhase> getPossiblePhases(GamePhase phase, GameEngineEvent event) {
        Map<GameEngineEvent, GamePhase> gameEngineEventGamePhaseMap = transitions.get(phase);
        if (gameEngineEventGamePhaseMap == null) return null;
        if (!gameEngineEventGamePhaseMap.containsKey(event)) return null;
        return gameEngineEventGamePhaseMap.values().stream().toList();
    }

    public GamePhase getNextPhase(GamePhase phase, GameEngineEvent event) {
        Map<GameEngineEvent, GamePhase> gameEngineEventGamePhaseMap = transitions.get(phase);
        if (gameEngineEventGamePhaseMap == null) return null;
        if (!gameEngineEventGamePhaseMap.containsKey(event)) return null;
        return gameEngineEventGamePhaseMap.get(event);
    }
}
