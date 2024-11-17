package com.orlandoneto.gameslist.repositories;

import com.orlandoneto.gameslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
