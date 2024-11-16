package com.orlandoneto.gameslist.controllers;

import com.orlandoneto.gameslist.dto.GameMinDTO;
import com.orlandoneto.gameslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/games")
    public List<GameMinDTO> findAll(){
        var result = gameService.findAll();
        return result;
    }


}
