package com.metaphorce.FabianLanderos.cineMagic.Entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "payment_table")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The name must not be empty")
    @NotNull(message = "The name must not be null")
    private String userName;

    @NotEmpty(message = "The address must not be empty")
    @NotNull(message = "The address must not be null")
    private String userAddress;

    @NotEmpty(message = "The bank account name must not be empty")
    @NotNull(message = "The bank account name must not be null")
    private String bankAccountName;

    @Size(min = 17, message = "The length of a card must be 16")
    private long cardNumber;
    private int CVV;
    private double amountCharged;
    private int user_id;

    //Constructor
    public Payment(){

    }

    public Payment(Long id, String userName, String userAddress, String bankAccountName, long cardNumber, int CVV, double amountCharged, int user_id) {
        this.id = id;
        this.userName = userName;
        this.userAddress = userAddress;
        this.bankAccountName = bankAccountName;
        this.cardNumber = cardNumber;
        this.CVV = CVV;
        this.amountCharged = amountCharged;
        this.user_id = user_id;
    }

    //Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public double getAmountCharged() {
        return amountCharged;
    }

    public void setAmountCharged(double amountCharged) {
        this.amountCharged = amountCharged;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
