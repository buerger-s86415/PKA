package com.example.model;

import jakarta.persistence.*;

@Entity
public class UGV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ugvId;
    private String description;
    private float maxSpeed;
    private float batteryLevel;
    @ManyToOne
    @JoinColumn(name = "tennant_id")
    private Tennant tennant;

    public UGV() {

    }
    // Getters und Setters
}
