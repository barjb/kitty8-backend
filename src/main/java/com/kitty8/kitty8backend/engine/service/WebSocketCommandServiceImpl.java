package com.kitty8.kitty8backend.engine.service;

import com.kitty8.kitty8backend.engine.EngineResult;
import com.kitty8.kitty8backend.engine.service.api.WebSocketCommandService;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.WebSocketCommand;
import org.springframework.stereotype.Component;

@Component
public class WebSocketCommandServiceImpl implements WebSocketCommandService {
    @Override
    public EngineResult handle(WebSocketCommand command) {
        return null;
    }
}
