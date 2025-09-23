package com.fca.cafeteria.data;

public class BebidaIngredienteData {
    private int idBebidaIngrediente;
    private int idBebida;
    private int idIngrediente;
    private int cantidad;

    public BebidaIngredienteData() {}

    public BebidaIngredienteData(int idBebidaIngrediente, int idBebida, int idIngrediente, int cantidad) {
        this.idBebidaIngrediente = idBebidaIngrediente;
        this.idBebida = idBebida;
        this.idIngrediente = idIngrediente;
        this.cantidad = cantidad;
    }

    public int getIdBebidaIngrediente() { return idBebidaIngrediente; }
    public void setIdBebidaIngrediente(int idBebidaIngrediente) { this.idBebidaIngrediente = idBebidaIngrediente; }

    public int getIdBebida() { return idBebida; }
    public void setIdBebida(int idBebida) { this.idBebida = idBebida; }

    public int getIdIngrediente() { return idIngrediente; }
    public void setIdIngrediente(int idIngrediente) { this.idIngrediente = idIngrediente; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}
