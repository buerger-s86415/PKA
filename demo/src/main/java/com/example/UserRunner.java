package com.example;



import com.example.model.Tennant;
import com.example.model.FleetUser;
import com.example.repositories.TennantRepository;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRunner implements CommandLineRunner {


    private final UserRepository userRepository;
    private final TennantRepository tennantRepository;

    @Autowired
    public UserRunner(UserRepository userRepository, TennantRepository tennantRepository) {
        this.userRepository = userRepository;
        this.tennantRepository = tennantRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Löschung aller Benutzer
        userRepository.deleteAll();

        Tennant tennant1 = new Tennant();
        tennantRepository.save(tennant1);


        // Erstellung von Benutzern
        FleetUser fleetUser1 = new FleetUser();
        fleetUser1.setUserID(1);
        fleetUser1.setUserName("Benutzer 1");
        fleetUser1.setTennant(tennant1); // Hier muss die Klasse Tennant existieren

        FleetUser fleetUser2 = new FleetUser();
        fleetUser2.setUserID(2);
        fleetUser2.setUserName("Benutzer 2");
        fleetUser2.setTennant(tennant1); // Hier muss die Klasse Tennant existieren

        userRepository.save(fleetUser1);
        userRepository.save(fleetUser2);

        // Abfrage aller Benutzer
        List<FleetUser> fleetUsers = (List<FleetUser>) userRepository.findAll();
        fleetUsers.forEach(System.out::println);

        // Abfrage eines Benutzers (Rückgabe kann auch null sein)
        Optional<FleetUser> user = userRepository.findById(1L);
        System.out.println(user);

        // Aktualisierung eines Benutzers
        user.get().setUserName("Benutzer 1 aktualisiert");
        userRepository.save(user.get()); // Hier wird save() verwendet, um den Benutzer zu aktualisieren

        // Abfrage des aktualisierten Benutzers
        user = userRepository.findById(1L);
        System.out.println(user);

        // Löschen eines Benutzers
        userRepository.delete(fleetUser2);
    }
}