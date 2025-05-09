package com.example.model;
import jakarta.persistence.*;


@Entity
public class TrackExecution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private FleetUser fleetUser;
    @ManyToOne
    @JoinColumn(name = "ugv_id")
    private UGV ugv;
    @ManyToOne
    @JoinColumn(name = "position_exec_id")
    private PositionExec positionExec;
    @ManyToOne
    @JoinColumn(name = "tennant_id")
    private Tennant tennant;

    public TrackExecution() {

    }
    // Getters und Setters
}
