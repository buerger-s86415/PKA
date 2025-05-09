package JPA_Java_Lsg;

import jakarta.persistence.*;

@Entity
public class PositionExec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private float latitude;
    private float longitude;
    private String timeReached;
    private float positionDeviation;

    @ManyToOne
    private Position position;
    
    @ManyToOne
    private TrackExecution trackExecution;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getTimeReached() {
        return timeReached;
    }

    public void setTimeReached(String timeReached) {
        this.timeReached = timeReached;
    }

    public float getPositionDeviation() {
        return positionDeviation;
    }

    public void setPositionDeviation(float positionDeviation) {
        this.positionDeviation = positionDeviation;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public TrackExecution getTrackExecution() {
        return trackExecution;
    }

    public void setTrackExecution(TrackExecution trackExecution) {
        this.trackExecution = trackExecution;
    }


    // Getter und Setter
    
}
