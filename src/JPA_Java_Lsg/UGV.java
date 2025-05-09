package JPA_Java_Lsg;

import jakarta.persistence.*;

@Entity
public class UGV {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ugvId;

    private String description;
    private float maxSpeed;
    private float batteryLevel;

    @ManyToOne
    private Tennant tennant;

    public int getUgvId() {
        return ugvId;
    }

    public void setUgvId(int ugvId) {
        this.ugvId = ugvId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(float batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Tennant getTennant() {
        return tennant;
    }

    public void setTennant(Tennant tennant) {
        this.tennant = tennant;
    }

    // Getter und Setter
    
}
