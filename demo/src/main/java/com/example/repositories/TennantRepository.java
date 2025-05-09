package com.example.repositories;

import com.example.model.Tennant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TennantRepository extends CrudRepository<Tennant, Long> {
}
