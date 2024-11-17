package com.orlandoneto.gameslist.services;

import com.orlandoneto.gameslist.dto.GameListDTO;
import com.orlandoneto.gameslist.dto.GameMaxDTO;
import com.orlandoneto.gameslist.dto.GameMinDTO;
import com.orlandoneto.gameslist.entities.Game;
import com.orlandoneto.gameslist.entities.GameList;
import com.orlandoneto.gameslist.repositories.GameListRepository;
import com.orlandoneto.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> listGamesList = gameListRepository.findAll();
        List<GameListDTO> listGamesListDTO = listGamesList.stream().map(obj -> new GameListDTO(obj)).toList();
        return listGamesListDTO;
    }




}
