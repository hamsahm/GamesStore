package com.tw.gamesStore.services;

import com.tw.gamesStore.entity.Games;
import com.tw.gamesStore.repository.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GamesServices {

    @Autowired
    private GamesRepository gamesRepository;

    public List<Games> getAllGames() {
        return gamesRepository.findAll();
    }
}
