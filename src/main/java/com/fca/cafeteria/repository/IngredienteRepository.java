package com.fca.cafeteria.repository;

import com.fca.cafeteria.data.IngredienteData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredienteRepository extends JpaRepository<IngredienteData, Integer> {
}
