package com.fca.cafeteria.data;

public class BebidaData {
    private int id;
    private String nombre;
    private String descripcion;
    private int idTipoBebida;

    public BebidaData() {}

    public BebidaData(int id, String nombre, String descripcion, int idTipoBebida) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idTipoBebida = idTipoBebida;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getIdTipoBebida() { return idTipoBebida; }
    public void setIdTipoBebida(int idTipoBebida) { this.idTipoBebida = idTipoBebida; }
}
