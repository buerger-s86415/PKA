package com.example.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shortName;
    private String description;
    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TrackExecution> trackExecutions;
    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Position> positions;
    @ManyToOne
    @JoinColumn(name = "tennant_id")
    private Tennant tennant;
    // Getters und Setters
    public Route() {
    }
}

