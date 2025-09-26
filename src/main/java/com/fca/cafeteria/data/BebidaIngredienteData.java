package com.fca.cafeteria.data;

import jakarta.persistence.*;

@Entity
@Table(name = "tBebidaIngrediente")
public class BebidaIngredienteData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBebidaIngrediente")
    private int idBebidaIngrediente;

    @ManyToOne(optional = false)
    @JoinColumn(
            name = "idBebida",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_bebida_ingrediente")
    )
    private BebidaData bebida;

    @ManyToOne(optional = false)
    @JoinColumn(
            name = "idIngrediente",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "fk_bebida_ingrediente")
    )
    private IngredienteData ingrediente;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    public BebidaIngredienteData() {}

    public BebidaIngredienteData(int idBebidaIngrediente, BebidaData bebida, IngredienteData ingrediente, int cantidad) {
        this.idBebidaIngrediente = idBebidaIngrediente;
        this.bebida = bebida;
        this.ingrediente = ingrediente;
        this.cantidad = cantidad;
    }

    public int getIdBebidaIngrediente() { return idBebidaIngrediente; }
    public void setIdBebidaIngrediente(int idBebidaIngrediente) {
        this.idBebidaIngrediente = idBebidaIngrediente;
    }

    public BebidaData getBebida() { return bebida; }
    public void setBebida(BebidaData bebida) { this.bebida = bebida; }

    public IngredienteData getIngrediente() { return ingrediente; }
    public void setIngrediente(IngredienteData ingrediente) { this.ingrediente = ingrediente; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}
