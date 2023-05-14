package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projection.GameMinProjection;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List <GameMinDTO> findAll(){
        var result = gameRepository.findAll();
        return result.stream().map(x ->  new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public ResponseEntity<Long> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return ResponseEntity.ok(listId);
    }
}
