package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projection.GameMinProjection;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
public class GameMinDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entities){
        this.id = entities.getId();
        this.title = entities.getTitle();
        this.year = entities.getYear();
        this.imgUrl = entities.getImgUrl();
        this.shortDescription = entities.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection){
        this.id = projection.getId();
        this.title = projection.getTitle();
        this.year = projection.getGameYear();
        this.imgUrl = projection.getImgUrl();
        this.shortDescription = projection.getShortDescription();
    }
}
