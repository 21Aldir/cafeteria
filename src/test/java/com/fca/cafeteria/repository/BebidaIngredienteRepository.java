package com.fca.cafeteria.repository;

import com.fca.cafeteria.data.BebidaIngredienteData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidaIngredienteRepository extends JpaRepository<BebidaIngredienteData, Integer> {
}
