package com.orlandoneto.gameslist.controllers;

import com.orlandoneto.gameslist.dto.GameListDTO;
import com.orlandoneto.gameslist.dto.GameMaxDTO;
import com.orlandoneto.gameslist.dto.GameMinDTO;
import com.orlandoneto.gameslist.services.GameListService;
import com.orlandoneto.gameslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        var result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findGamesByList(@PathVariable Long listId){
        var gamesMinDTO = gameService.findByList(listId);
        return gamesMinDTO;
    }



}
