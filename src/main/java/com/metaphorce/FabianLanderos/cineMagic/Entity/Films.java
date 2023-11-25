package com.metaphorce.FabianLanderos.cineMagic.Entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "film_table")
public class Films {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filmName;
    private String description;
    private String rating;
    private double priceTicket;
    private boolean isParentalGuideNeeded;
    private int user_id;

    //Constructors
    public Films(){

    }

    public Films(Long id, String filmName, String description, String rating, double priceTicket, boolean isParentalGuideNeeded, int user_id) {
        this.id = id;
        this.filmName = filmName;
        this.description = description;
        this.rating = rating;
        this.priceTicket = priceTicket;
        this.isParentalGuideNeeded = isParentalGuideNeeded;
        this.user_id = user_id;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public double getPriceTicket() {
        return priceTicket;
    }

    public void setPriceTicket(double priceTicket) {
        this.priceTicket = priceTicket;
    }

    public boolean isParentalGuideNeeded() {
        return isParentalGuideNeeded;
    }

    public void setParentalGuideNeeded(boolean parentalGuideNeeded) {
        isParentalGuideNeeded = parentalGuideNeeded;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
