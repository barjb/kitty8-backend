package com.kitty8.kitty8backend.engine.Service.api;

import com.kitty8.kitty8backend.engine.EngineResult;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.command.BaseCommand;

public interface GameCommandService {
    EngineResult handle(BaseCommand command);
}
