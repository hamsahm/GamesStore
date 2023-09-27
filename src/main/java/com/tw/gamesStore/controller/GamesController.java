package com.tw.gamesStore.controller;

import com.tw.gamesStore.entity.Games;
import com.tw.gamesStore.services.GamesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class GamesController {

    @Autowired
    private GamesServices gamesServices;
    @GetMapping("/games")
    public ResponseEntity<List<Games>> getAllGames() {
        return new ResponseEntity(gamesServices.getAllGames(), HttpStatus.OK);
    }



}
