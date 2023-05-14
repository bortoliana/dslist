package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Getter
@Setter
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(){

    }
    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity, this);
    }

    public static List<ResponseEntity> findById(Long id) {
        return null;
    }

    public static ResponseEntity<?> ok(Long result) {
        return null;
    }
}
