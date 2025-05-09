package JPA_Java_Lsg;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class TrackExecution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private UGV ugv;

    @ManyToOne
    private User user;

    @ManyToOne
    private Tennant tennant;

    @OneToMany(mappedBy = "trackExecution", cascade = CascadeType.ALL)
    private List<PositionExec> positionExecs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UGV getUgv() {
        return ugv;
    }

    public void setUgv(UGV ugv) {
        this.ugv = ugv;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Tennant getTennant() {
        return tennant;
    }

    public void setTennant(Tennant tennant) {
        this.tennant = tennant;
    }

    public List<PositionExec> getPositionExecs() {
        return positionExecs;
    }

    public void setPositionExecs(List<PositionExec> positionExecs) {
        this.positionExecs = positionExecs;
    }

    // Getter und Setter
    
}
