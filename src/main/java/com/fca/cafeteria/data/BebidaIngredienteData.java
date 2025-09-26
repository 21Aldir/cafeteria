package com.fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tBebidaIngrediente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BebidaIngredienteData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBebidaIngrediente;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idBebida", foreignKey = @ForeignKey(name = "fk_bebida_bebidaIngrediente"))
    private BebidaData bebida;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idIngrediente", foreignKey = @ForeignKey(name = "fk_ingrediente_bebidaIngrediente"))
    private IngredienteData ingrediente;

    @Column(nullable = false)
    private int cantidad;
}
