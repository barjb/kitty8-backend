package com.kitty8.kitty8backend.infrastructure.persistence.repository.state.api;

import com.kitty8.kitty8backend.infrastructure.persistence.entity.state.CardState;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CardStateRepository extends CrudRepository<CardState, UUID> {
}
