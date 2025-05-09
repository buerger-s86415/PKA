package JPA_Java_Lsg;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String shortName;
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Position> positions;

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
    private List<TrackExecution> trackExecutions;

    @ManyToOne
    private Tennant tennant;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public List<TrackExecution> getTrackExecutions() {
        return trackExecutions;
    }

    public void setTrackExecutions(List<TrackExecution> trackExecutions) {
        this.trackExecutions = trackExecutions;
    }

    public Tennant getTennant() {
        return tennant;
    }

    public void setTennant(Tennant tennant) {
        this.tennant = tennant;
    }

    // Getter und Setter
    
}
