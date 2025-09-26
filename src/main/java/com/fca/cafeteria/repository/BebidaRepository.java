package com.fca.cafeteria.repository;

import com.fca.cafeteria.data.BebidaData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BebidaRepository extends JpaRepository<BebidaData, Integer> {
    boolean existsByNombre(String nombre);
    Optional<BebidaData> findByNombre(String nombre);
}
