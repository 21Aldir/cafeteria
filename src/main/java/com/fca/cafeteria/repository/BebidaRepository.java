package com.fca.cafeteria.repository;

import com.fca.cafeteria.data.BebidaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidaRepository extends JpaRepository<BebidaData, Integer> {

    boolean existsByNombreBebida(String nombreBebida);
}
