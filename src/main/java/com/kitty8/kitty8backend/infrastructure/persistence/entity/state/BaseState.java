package com.kitty8.kitty8backend.infrastructure.persistence.entity.state;

import com.kitty8.kitty8backend.domain.common.GamePhase;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.Player;

import java.util.List;
import java.util.UUID;

public class BaseState {
    private UUID ID;
    private List<Player> players;
    private Player currentPlayer;
    private GamePhase phase;
    private UUID gameID;
    private UUID roundID;
}
