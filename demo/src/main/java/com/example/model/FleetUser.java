package com.example.model;

import jakarta.persistence.*;

@Entity
public class FleetUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int userID;
    private String userName;
    @ManyToOne
    @JoinColumn(name = "tennant_id")
    private Tennant tennant;

    public FleetUser() {

    }
    // Getters und Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Tennant getTennant() {
        return tennant;
    }

    public void setTennant(Tennant tennant) {
        this.tennant = tennant;
    }


}
