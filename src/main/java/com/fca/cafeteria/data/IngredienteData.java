package com.fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tIngrediente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IngredienteData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    private String descripcion;

    @Column(nullable = false)
    private float costo;
}
