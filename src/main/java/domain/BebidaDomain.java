package com.fca.cafeteria.domain;

import com.fca.cafeteria.data.BebidaData;

public class BebidaDomain {
    private BebidaData bebida;

    public BebidaDomain(BebidaData bebida) {
        this.bebida = bebida;
    }

    public String descripcionCompleta() {
        return bebida.getNombre() + " - " + bebida.getDescripcion();
    }

    public BebidaData getBebida() { return bebida; }
    public void setBebida(BebidaData bebida) { this.bebida = bebida; }
}
