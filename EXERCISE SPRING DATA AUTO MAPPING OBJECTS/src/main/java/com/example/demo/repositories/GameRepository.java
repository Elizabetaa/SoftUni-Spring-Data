package com.example.demo.repositories;

import com.example.demo.domain.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {

    Optional<Game> findById(Long id);

    void deleteById(Long id);

    @Query("SELECT g FROM Game AS g")
    List<Game> getAll();

    Game findByTitle(String title);

}
