package com.fca.cafeteria.data;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tTipoBebida")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoBebidaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "text")
    private String descripcion;
}
