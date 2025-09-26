package com.fca.cafeteria.data;

import jakarta.persistence.*;

@Entity
@Table(name = "tBebida")
public class BebidaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idBebida;

    @Column(name = "nombre", nullable = false, columnDefinition = "TEXT")
    private String nombreBebida;

    @Column(name = "descripcion", nullable = false, columnDefinition = "TEXT")
    private String descripcionBebida;

    @ManyToOne
    @JoinColumn(
            name = "idTipoBebida",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_bebida_tipo")
    )
    private TipoBebidaData tipoBebida;

    public BebidaData() {}

    public BebidaData(int idBebida, String nombreBebida, String descripcionBebida, TipoBebidaData tipoBebida) {
        this.idBebida = idBebida;
        this.nombreBebida = nombreBebida;
        this.descripcionBebida = descripcionBebida;
        this.tipoBebida = tipoBebida;
    }

    public int getIdBebida() { return idBebida; }
    public void setIdBebida(int idBebida) { this.idBebida = idBebida; }

    public String getNombreBebida() { return nombreBebida; }
    public void setNombreBebida(String nombreBebida) { this.nombreBebida = nombreBebida; }

    public String getDescripcionBebida() { return descripcionBebida; }
    public void setDescripcionBebida(String descripcionBebida) { this.descripcionBebida = descripcionBebida; }

    public TipoBebidaData getTipoBebida() { return tipoBebida; }
    public void setTipoBebida(TipoBebidaData tipoBebida) { this.tipoBebida = tipoBebida; }
}
