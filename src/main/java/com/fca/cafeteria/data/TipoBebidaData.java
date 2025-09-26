package com.fca.cafeteria.data;

import jakarta.persistence.*;

@Entity
@Table(name = "tTipoBebida")
public class TipoBebidaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idTipoBebida;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcionTipoBebida;

    public TipoBebidaData() {}

    public TipoBebidaData(int idTipoBebida, String descripcionTipoBebida) {
        this.idTipoBebida = idTipoBebida;
        this.descripcionTipoBebida = descripcionTipoBebida;
    }

    public int getIdTipoBebida() { return idTipoBebida; }
    public void setIdTipoBebida(int idTipoBebida) { this.idTipoBebida = idTipoBebida; }

    public String getDescripcionTipoBebida() { return descripcionTipoBebida; }
    public void setDescripcionTipoBebida(String descripcionTipoBebida) {
        this.descripcionTipoBebida = descripcionTipoBebida;
    }
}
