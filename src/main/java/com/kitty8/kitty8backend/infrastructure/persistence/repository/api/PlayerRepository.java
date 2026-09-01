package com.kitty8.kitty8backend.infrastructure.persistence.repository.api;

import com.kitty8.kitty8backend.infrastructure.persistence.entity.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PlayerRepository extends CrudRepository<Player, UUID> {
}
