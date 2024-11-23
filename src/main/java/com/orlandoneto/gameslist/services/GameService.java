package com.orlandoneto.gameslist.services;

import com.orlandoneto.gameslist.dto.GameMaxDTO;
import com.orlandoneto.gameslist.dto.GameMinDTO;
import com.orlandoneto.gameslist.entities.Game;
import com.orlandoneto.gameslist.projections.GameMinProjection;
import com.orlandoneto.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> listGames = gameRepository.findAll();
        List<GameMinDTO> listDTOGames = listGames.stream().map(obj -> new GameMinDTO(obj)).toList();
        return listDTOGames;
    }

    @Transactional(readOnly = true)
    public GameMaxDTO findById(Long id){
        var game = new GameMaxDTO(gameRepository.findById(id).get());
        return game;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long id){
        List<GameMinProjection > listGames = gameRepository.searchByList(id);
        List<GameMinDTO> listDTOGames = listGames.stream().map(obj -> new GameMinDTO(obj)).toList();
        return listDTOGames;
    }



}
