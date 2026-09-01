package com.kitty8.kitty8backend.infrastructure.persistence.repository.state.api;

import com.kitty8.kitty8backend.infrastructure.persistence.entity.state.RouletteState;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface RouletteStateRepository extends CrudRepository<RouletteState, UUID> {
}
