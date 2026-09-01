package com.kitty8.kitty8backend.engine.Games;

import com.kitty8.kitty8backend.engine.EngineResult;
import com.kitty8.kitty8backend.engine.GameEngine;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.command.BaseCommand;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.state.BaseState;
import org.springframework.stereotype.Component;

@Component
public class RouletteEngine implements GameEngine {
    @Override
    public EngineResult handle(BaseState state, BaseCommand command) {
        return null;
    }
}
