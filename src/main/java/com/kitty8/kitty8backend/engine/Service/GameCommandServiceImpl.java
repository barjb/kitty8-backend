package com.kitty8.kitty8backend.engine.Service;

import com.kitty8.kitty8backend.engine.EngineResult;
import com.kitty8.kitty8backend.engine.Service.api.GameCommandService;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.command.BaseCommand;
import org.springframework.stereotype.Component;

@Component
public class GameCommandServiceImpl implements GameCommandService {
    @Override
    public EngineResult handle(BaseCommand command) {
        return null;
    }
}
