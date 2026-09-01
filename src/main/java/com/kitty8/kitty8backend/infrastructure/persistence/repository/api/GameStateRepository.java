package com.kitty8.kitty8backend.infrastructure.persistence.repository.api;

import com.kitty8.kitty8backend.infrastructure.persistence.entity.GameState;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface GameStateRepository extends CrudRepository<GameState, UUID> {
}
