package com.beatriz.campanha.repositories;


import com.beatriz.campanha.entities.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends JpaRepository<Time, Long> {

}
