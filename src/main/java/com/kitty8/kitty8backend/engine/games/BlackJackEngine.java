package com.kitty8.kitty8backend.engine.games;

import com.kitty8.kitty8backend.engine.EngineResult;
import com.kitty8.kitty8backend.engine.GameEngine;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.WebSocketCommand;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.GameState;
import org.springframework.stereotype.Component;

@Component
public class BlackJackEngine implements GameEngine {
    @Override
    public EngineResult handle(GameState state, WebSocketCommand command) {
        return null;
    }
}
