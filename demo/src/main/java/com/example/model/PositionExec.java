package com.example.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class PositionExec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private float latitude;
    private float longitude;
    private Date timeReached;
    private float positionDeviation;
    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;
    @ManyToOne
    @JoinColumn(name = "track_execution_id")
    private TrackExecution trackExecution;

    public PositionExec() {

    }

    // Getters und Setters
}