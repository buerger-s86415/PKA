package JPA_Java_Lsg;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    private String userName;

    @ManyToOne
    private Tennant tennant;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Tennant getTennant() {
        return tennant;
    }

    public void setTennant(Tennant tennant) {
        this.tennant = tennant;
    }

    // Getter und Setter
    
}
