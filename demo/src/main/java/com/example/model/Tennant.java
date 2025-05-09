package com.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Tennant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int tennantID;
    @OneToMany(mappedBy = "tennant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Route> routes;
    @OneToMany(mappedBy = "tennant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FleetUser> fleetUsers;
    @OneToMany(mappedBy = "tennant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TrackExecution> trackExecutions;
    @OneToMany(mappedBy = "tennant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UGV> ugvs;

    public Tennant() {
    }

    public Tennant(Long id) {
        this.id = id;
    }
    // Getters und Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTennantID() {
        return tennantID;
    }

    public void setTennantID(int tennantID) {
        this.tennantID = tennantID;
    }
}
