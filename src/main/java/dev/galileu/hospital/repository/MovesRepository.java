package dev.galileu.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.galileu.hospital.entity.Moves;

public interface MovesRepository extends JpaRepository<Moves, Long> {

}
