package com.orlandoneto.gameslist.services;

import com.orlandoneto.gameslist.dto.GameMinDTO;
import com.orlandoneto.gameslist.entities.Game;
import com.orlandoneto.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> listGames = gameRepository.findAll();
        List<GameMinDTO> listDTOGames = listGames.stream().map(obj -> new GameMinDTO(obj)).toList();
        return listDTOGames;
    }
}
