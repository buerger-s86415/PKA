package com.example.model;

import jakarta.persistence.*;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float latitude;
    private float longitude;
    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;

    public Position() {
    }
    // Getters und Setters
}
