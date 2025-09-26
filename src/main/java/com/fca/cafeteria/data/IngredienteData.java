package com.fca.cafeteria.data;

import jakarta.persistence.*;

@Entity
@Table(name = "tIngrediente")
public class IngredienteData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idIngrediente;

    @Column(name = "nombre", nullable = false, columnDefinition = "TEXT")
    private String nombreIngrediente;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcionIngrediente;

    @Column(name = "costo", nullable = false)
    private float costo;

    public IngredienteData() {}

    public IngredienteData(int idIngrediente, String nombreIngrediente, String descripcionIngrediente, float costo) {
        this.idIngrediente = idIngrediente;
        this.nombreIngrediente = nombreIngrediente;
        this.descripcionIngrediente = descripcionIngrediente;
        this.costo = costo;
    }

    public int getIdIngrediente() { return idIngrediente; }
    public void setIdIngrediente(int idIngrediente) { this.idIngrediente = idIngrediente; }

    public String getNombreIngrediente() { return nombreIngrediente; }
    public void setNombreIngrediente(String nombreIngrediente) { this.nombreIngrediente = nombreIngrediente; }

    public String getDescripcionIngrediente() { return descripcionIngrediente; }
    public void setDescripcionIngrediente(String descripcionIngrediente) {
        this.descripcionIngrediente = descripcionIngrediente;
    }

    public float getCosto() { return costo; }
    public void setCosto(float costo) { this.costo = costo; }
}
