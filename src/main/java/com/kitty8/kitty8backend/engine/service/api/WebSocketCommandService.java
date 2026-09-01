package com.kitty8.kitty8backend.engine.service.api;

import com.kitty8.kitty8backend.engine.EngineResult;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.WebSocketCommand;

public interface WebSocketCommandService {
    EngineResult handle(WebSocketCommand command);
}
