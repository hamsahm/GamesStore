package com.tw.gamesStore.entity;

import javax.persistence.*;

@Entity
public class Games {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer gameId;
    @Column(name = "game_name")
    private String gameName;
    @Column(name = "games_url")
    private String gamesImageUrl;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Double price;
    @Column(name = "more_details")
    private String moreDetails;


    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gamesName) {
        this.gameName = gamesName;
    }

    public String getGamesImageUrl() {
        return gamesImageUrl;
    }

    public void setGamesImageUrl(String gamesImageUrl) {
        this.gamesImageUrl = gamesImageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMoreDetails() {
        return moreDetails;
    }

    public void setMoreDetails(String moreDetails) {
        this.moreDetails = moreDetails;
    }
}
