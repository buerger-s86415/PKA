package com.example.repositories;

import com.example.model.FleetUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<FleetUser, Long> {

}