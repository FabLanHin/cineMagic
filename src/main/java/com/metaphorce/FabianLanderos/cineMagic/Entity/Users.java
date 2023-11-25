package com.metaphorce.FabianLanderos.cineMagic.Entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user_table")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The name must not be empty")
    @NotNull(message = "The name must not be null")
    @Size(min = 2, message = "The name must have at least two letters")
    private String name;

    @Email(message = "The email type of is incorrect")
    private String email;

    @NotEmpty(message = "The password must not be empty")
    @NotNull(message = "The password must not be null")
    @Size(min = 7, message = "The password must have at least 7 letters")
    private String password;
    private int age;

    @NotEmpty(message = "The assigned seat must not be empty")
    @NotNull(message = "The assigned seat must not be null")
    private String assignedSeat;

    @NotEmpty(message = "The payment_id must not be empty")
    @NotNull(message = "The payment_id must not be null")
    private int payment_id;

    @NotNull(message = "The foodBoolean must not be null")
    private boolean isFoodBought;

    @NotEmpty(message = "The film_id must not be empty")
    @NotNull(message = "The film_id must not be null")
    private int film_id;

    private int food_id;

    //Constructors
    public Users(){

    }

    public Users(Long id, String name, String email, String password, int age, String assignedSeat, int payment_id, boolean isFoodBought, int film_id, int food_id) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.assignedSeat = assignedSeat;
        this.payment_id = payment_id;
        this.isFoodBought = isFoodBought;
        this.film_id = film_id;
        this.food_id = food_id;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAssignedSeat() {
        return assignedSeat;
    }

    public void setAssignedSeat(String assignedSeat) {
        this.assignedSeat = assignedSeat;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public boolean isFoodBought() {
        return isFoodBought;
    }

    public void setFoodBought(boolean foodBought) {
        isFoodBought = foodBought;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }
}
