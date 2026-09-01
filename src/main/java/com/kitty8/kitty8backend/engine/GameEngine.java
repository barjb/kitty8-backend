package com.kitty8.kitty8backend.engine;

import com.kitty8.kitty8backend.infrastructure.persistence.entity.command.BaseCommand;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.state.BaseState;

public interface GameEngine {
    // Engine works on state
    public EngineResult handle(BaseState state, BaseCommand command);
}
