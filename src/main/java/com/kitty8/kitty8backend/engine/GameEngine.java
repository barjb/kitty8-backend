package com.kitty8.kitty8backend.engine;

import com.kitty8.kitty8backend.infrastructure.persistence.entity.WebSocketCommand;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.GameState;

public interface GameEngine {
    // Engine works on state
    public EngineResult handle(GameState state, WebSocketCommand command);
}
