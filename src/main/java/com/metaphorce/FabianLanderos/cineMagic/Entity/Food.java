package com.metaphorce.FabianLanderos.cineMagic.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "food_table")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "The field must not be null")
    private String sizePopcorn;

    @NotNull(message = "The field must not be null")
    private String sizeSoda;

    @NotNull(message = "The field must not be null")
    private String candyBought;

    @NotNull(message = "The field must not be null")
    private int user_id;

    public Food(){

    }

    public Food(Long id, String sizePopcorn, String sizeSoda, String candyBought, int user_id) {
        this.id = id;
        this.sizePopcorn = sizePopcorn;
        this.sizeSoda = sizeSoda;
        this.candyBought = candyBought;
        this.user_id = user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSizePopcorn() {
        return sizePopcorn;
    }

    public void setSizePopcorn(String sizePopcorn) {
        this.sizePopcorn = sizePopcorn;
    }

    public String getSizeSoda() {
        return sizeSoda;
    }

    public void setSizeSoda(String sizeSoda) {
        this.sizeSoda = sizeSoda;
    }

    public String getCandyBought() {
        return candyBought;
    }

    public void setCandyBought(String candyBought) {
        this.candyBought = candyBought;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
