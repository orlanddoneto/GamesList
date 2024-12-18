package com.orlandoneto.gameslist.controllers;

import com.orlandoneto.gameslist.dto.GameMaxDTO;
import com.orlandoneto.gameslist.dto.GameMinDTO;
import com.orlandoneto.gameslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        var result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameMaxDTO findById(@PathVariable Long id){
        var result = gameService.findById(id);
        return result;
    }


}
