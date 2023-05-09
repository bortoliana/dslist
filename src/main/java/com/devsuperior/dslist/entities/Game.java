package com.devsuperior.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Data
@Getter
@Setter
@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String gnre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game game)) return false;
        return Objects.equals(getId(), game.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
