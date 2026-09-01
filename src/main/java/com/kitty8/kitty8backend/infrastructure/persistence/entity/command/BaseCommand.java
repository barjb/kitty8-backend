package com.kitty8.kitty8backend.infrastructure.persistence.entity.command;

import com.kitty8.kitty8backend.domain.common.GameEngineEvent;
import com.kitty8.kitty8backend.infrastructure.persistence.entity.Player;

import java.time.LocalDateTime;
import java.util.UUID;

public class BaseCommand {
    private UUID ID;
    private Player player;
    private String gameID;
    private UUID roundID;
    private GameEngineEvent gameEngineEvent;
    private LocalDateTime createdAt;
}
