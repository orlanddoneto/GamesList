package com.orlandoneto.gameslist.repositories;

import com.orlandoneto.gameslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
