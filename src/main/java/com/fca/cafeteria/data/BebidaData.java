package com.fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tBebida")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BebidaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "idTipoBebida", foreignKey = @ForeignKey(name = "fk_bebida_tipo"))
    private TipoBebidaData tipoBebida;
}
