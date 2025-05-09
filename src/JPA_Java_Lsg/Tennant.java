package JPA_Java_Lsg;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Tennant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tennantID;

    @OneToMany(mappedBy = "tennant", cascade = CascadeType.ALL)
    private List<Route> routes;

    @OneToMany(mappedBy = "tennant", cascade = CascadeType.ALL)
    private List<User> users;

    @OneToMany(mappedBy = "tennant", cascade = CascadeType.ALL)
    private List<UGV> ugvs;

    @OneToMany(mappedBy = "tennant", cascade = CascadeType.ALL)
    private List<TrackExecution> trackExecutions;

    public int getTennantId() {
        return tennantID;
    }

    public int getTennantID() {
        return tennantID;
    }

    public void setTennantID(int tennantID) {
        this.tennantID = tennantID;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<UGV> getUgvs() {
        return ugvs;
    }

    public void setUgvs(List<UGV> ugvs) {
        this.ugvs = ugvs;
    }

    public List<TrackExecution> getTrackExecutions() {
        return trackExecutions;
    }

    public void setTrackExecutions(List<TrackExecution> trackExecutions) {
        this.trackExecutions = trackExecutions;
    }

    // Getter und Setter
    
}
