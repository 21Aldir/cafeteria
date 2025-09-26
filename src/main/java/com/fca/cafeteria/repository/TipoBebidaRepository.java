package com.fca.cafeteria.repository;

import com.fca.cafeteria.data.TipoBebidaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TipoBebidaRepository extends JpaRepository<TipoBebidaData, Integer> {

    Optional<TipoBebidaData> findByDescripcionTipoBebida(String descripcion);
}
