package com.fca.cafeteria.repository;

import com.fca.cafeteria.data.TipoBebidaData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TipoBebidaRepository extends JpaRepository<TipoBebidaData, Integer> {
    Optional<TipoBebidaData> findByDescripcion(String descripcion);
}
