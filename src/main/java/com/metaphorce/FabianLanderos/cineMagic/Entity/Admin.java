package com.metaphorce.FabianLanderos.cineMagic.Entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "admin_table")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The name must not be empty")
    @NotNull(message = "The name must not be null")
    @Size(min = 2, message = "The name must have at least two letters")
    private String adminName;

    @Email(message = "The email type of is incorrect")
    private String adminEmail;
    private String adminPassword;
    private int authNumber;

    //Constructor
    public Admin() {

    }

    public Admin(Long id, String adminName, String adminEmail, String adminPassword, int authNumber) {
        this.id = id;
        this.adminName = adminName;
        this.adminEmail = adminEmail;
        this.adminPassword = adminPassword;
        this.authNumber = authNumber;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public int getAuthNumber() {
        return authNumber;
    }

    public void setAuthNumber(int authNumber) {
        this.authNumber = authNumber;
    }
}
